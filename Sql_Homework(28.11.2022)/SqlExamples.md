# SQL Examples 
#### 28-11-2022 Tarihli ödev için 10 adet SQl Sorgusu yazılmıştır.
Bu sorgular için PostgreSQL üzerinden hazırlanmış olan tablolar değil farklılık teşkil etmesi adına 
internetten bulunan bir sql editör ile yazılmıştır. 


##### 1.(Inner) Join
_Kategori ve ürün tablosunun `category_id` sütunu ile bağlanması_

![Join](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/1.jpeg)
---
#### 2.Left (Outer) Join
_Ürün tablosunun tamamı ve kategori tablosunun `category_id` sütunu ile ona bağlanması_

![Left Join](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/2.jpeg)
---
#### 3.Right (Outer) Join
_Kategori tablosunun`category_id` sütunu ile kategori tablosuna bağlanması ve kategori tablosunun tamamı_

![Right Join](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/3.jpeg)
---
#### 4.Full Outer Join
_Kategori tablosunun`category_id` sütunu ile kategori tablosuna bağlanması ve her iki tablonun tamamı_

![Full Outer Join](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/4.jpeg)
---
#### 5.Between 
_İsminde 'A' ve 'J' bulunan ürünlerin getirilmesi_

![Between](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/5.jpeg)
---
#### 6.Order By
_İsminde 'A' ve 'J' bulunan ürünlerin ``category_id``'ye göre sıralanması_

![Order By](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/6.jpeg)
---
#### 7.Group By (Örnek 1)
_İsminde 'A' ve 'J' bulunan ürünlerin ``product_name``'ye göre gruplanması, ``product_name``'ye göre sıralanması ve aynı isme sahip ürünlerin sayısı_

![Group By](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/7.jpeg)
---
#### 8.Group By (Örnek 2)
_Ürünlerin ``category_id``'ye göre gruplanması, ``product_name``'e göre sıralanması, aynı kategorideki ürünlerin sayısı ve `category_id` değerleri_

![Group By](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/8.jpeg)
---
#### 9.Insert Into 
_Ürünler tablosuna yeni ürün eklenmesi_

![Insert Into](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/9.jpeg)
---
#### 10.Drop Table
_Ürünler tablosunun silinmesi(Silinen tablo ismi combobox'da görülmemektedir.)_

![Insert Into](https://github.com/mesutcalim/EtiyaCamp/blob/master/Sql_Homework(28.11.2022)/10.jpeg)
---

