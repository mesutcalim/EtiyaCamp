# JPQL Sorgulama Dili
JPQL (Java Persistence Query Language) , SQL diline benzer şekilde sorgulama yapmaya olanak tanır.
Dinamik ve İsimlendirilmiş sorgular JPQL diliyle oluşturulurlar.
``SELECT o FROM order o ``

JPQL veya Java Persistence Query Language SQL benzeri JPA Entity nesneleri üzerinden sorgulama yapmak için kullanılır.

JPQL kullanımı amacı tablolar yerine **sınıfları** kullanmak ve veritabanı yönetim sistemleri arasındaki SQL söz dizimi 
farklılıklarını en aza indirmektedir.

JPQL, HQL (Hibernate Query Language) ‘e fazlasıyla benzeşir. Bu diller SQL (Structured Query Language) diline hemen 
hemen benzemelerine karşın, **kullandığı argümanlar veritabanı tabloları yerine Entity nesneleridir.**
Entity nesneleri yönetilirken JPA standardında yer alan **_EntityManager ya da Hibernate’ de olduğu gibi 
Session nesneleri kullanılıyor._** Benzer görevleri üstlenen bu nesneler persist(..), merge(..), remove(..), find(…)
gibi yordamlar sunarken, aynı zamanda entity nesnelerini sorgulamak amacıyla çeşitli yordamlar da sağlıyor.

* NOT:JPQL sorguları eğer NamedQuery değillerse çalışma anında değerlendirmeye alınacaklarından dolayı, çalışma anı 
istisnaları alınabilecektir, JPQL sözdizimine bu sebeple dikkat edilmelidir.
----
JPQL sorgulama dili kullanım örnekleri: 
````
Query kitapSorgusu1 = em.createQuery("SELECT k FROM Kitap k");

List<Object> kitapSorgusuListesi1 = kitapSorgusu1.getResultList();

for(Object li:kitapSorgusuListesi1)
logger.log(Level.INFO, "Tüm kitaplar sorgusu 1 : {0}", (Kitap)li);
````
yukardaki örnekte bir ``EntityManager em`` nesnesi oluşturulmuş ve bunun içinde de bir query çalıştırılmıştır.

Ancak spring bize bu konuda kolaylıklar sağlamaktadır.

Aşağıda Query kullanmadan yazılmış bir sorgu örneği görüyoruz.
````
List<Order> getAllOrdersOrderById(int id);
````
Burada aslında bir adet ``"SELECT * FROM orders WHERE orders.id= :id"`` sorgusu bulunmaktadır.
Bu sorgu JpaRepository interface'i üzerinden bizlere otomatik atanmaktadır.
Görüldüğü gibi Spring ile Repository içinde sorgu yazmak çok kolaydır. Ancak bu fonksiyonlar çok hassastır ve hata 
yapmaya çok müsaittir. Bu yüzden yazarken çok dikkatli olunmalıdır.

Bir diğer örnek ise:
````
@Query("SELECT o FROM Order o WHERE o.payment_id = :id")
List<Order> findAllOrdersByPaymentId(int id);
````
Bu örnekte ise ilgili fonksiyonun üzerine çalıştırması gereken sorgu yazılmış olup fonksiyon çağırılınca
yapacağı işlem belirtilmiştir. 
