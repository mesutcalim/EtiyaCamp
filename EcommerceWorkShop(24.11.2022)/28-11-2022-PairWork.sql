--hangi ülkeden hangi ürün kaç sipariş var 
Select  name , sale_count , country.country_name from product p
inner join order_details od on p.id = od.product_id
inner join orders on orders.id= od.order_id
inner join customer on customer.id = orders.customer_id
inner join users on users.id = customer.user_id
inner join address on address.id = users.address_id
inner join country on country.id= address.country_id


--Ürün sayısına göre kategori sıralaması (grpup by)

select Sum(stock), categories.name from categories 
inner join product on categories.id = product.category_id
group by categories.name;

--Sadece satılan ürünleri sırlayalım
select sale_count, name from product where sale_count is not null group by sale_count,name ;

--A-h arasındaki şehir isimleri
Select * from city 
where city_name between 'A' and 'H' 
order by city_name

--Kategory id si ... olan kategori ismini değiştir.
Update categories
set name = 'Akıllı Cihazlar'
where id = 3;

--Ankaradaki userları getirelim
Select first_name as "Kullanıcı Adı",last_name as "Kullanıcı Soyadı" from users 
inner join address on users.address_id = address.id
inner join country on address.country_id = country.id
inner join city on country.city_id = city.id
where city.city_name = 'Ankara'

--Ürün ismine göre ürün fiyatı değiştirme 
Update product 
set unit_price = '1999.00'
where name = 'Kolye'

--Bütün ülkeler ve şehirleri getir
Select * from country 
full outer join city on country.city_id = city.id 

--İçinde Fransa, Türkiye ve Arjantin olan adreslere sahip userlar
Select first_name,last_name from users
inner join address on users.address_id = address.id
inner join country on address.country_id = country.id
where country.country_name in ('Fransa', 'Türkiye', 'Arjantin')

--Bütün bölgeler ve şehirler
Select * from district 
left join city on district.id = city.district_id


