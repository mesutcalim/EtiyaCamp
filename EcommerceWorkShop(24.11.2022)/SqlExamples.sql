--1.kategorisi aksesuar olan rengi yeşil olan ürünlerin listelenmesi 
select product.name from ((product inner join categories on product.category_id = categories.id) 
inner join color on product.color_id = color.id ) 
where categories.name = 'Aksesuar' and color.name = 'yeşil';

--2.kullanıcıların ülkesi türkiye ve şehri ankara olanların listelenmesi
Select users.first_name from (((users inner join address on users.address_id = address.id) 
inner join country on address.country_id = country.id) 
inner join city on country.city_id = city.id) where city.city_name = 'Ankara';

--3.Müşteri tablosundaki Soyadı elmas olanların adını platinium yapma
UPDATE users
SET  last_name = 'platinium'
WHERE users.last_name = 'Elmas';

--4.Order idsi ... olanı listeleme
Select first_name,last_name from ((users 
inner join customer on users.id = customer.user_id)
inner join orders on customer.id = orders.customer_id) where orders.id = 1;

--5.Shipper idsi ... olan siparişi listeleme
Select orders.id,order_date,ship_date,customer_id from orders 
inner join shipper on orders.shipper_id = shipper.id where shipper.id = 1;


--6.Shipper id ve payment methoda göre sipariş tarihi listeleme
Select order_date from ((orders
inner join shipper on orders.shipper_id = shipper.id)
inner join payment_method on orders.payment_id = payment_method.id) where payment_method.name = 'Cash';

--7.Ürünleri isme göre sıralama
Select * from product order by product.name ;

--8.Ürünleri Kategorilerine göre alfabetik sıralama
SELECT product.name,categories.name from product inner join categories on product.category_id = categories.id 
order by categories.name asc ;

--9.İçerisinde a geçen ilçelerin sayısı
Select Count(district_name) from district where  LOWER(district_name) like '%a%';

--10.Ürünlerin isimlerinin uzunluğu ortalamanın üzerinde olanların ismini getir.
Select product.name from product where length(name) < (Select AVG(length(product.name)) from product);
