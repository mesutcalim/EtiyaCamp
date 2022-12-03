
## JPA(Java Persistence API) Nedir? 

Java Persistence API, ilişkisel verilerin Java sınıfları ile tutulmasına ve uygulamanın sonlanmasından sonra verinin 
kalıcı olmasını sağlayan teknolojidir.

JPA ile geliştiriciler SQL komutları yerine direk olarak nesneler üzerinde çalışabilir. SQL sorgularını JPA kendi 
içerisinde barındırır. Veritabanında verileri saklayabilir, güncelleyebilir veya veritabanından verileri çekebilir veya 
map edebilirsiniz. JPA, verilerin veritabanı üzerinde nasıl eşleşeceği, verinin güvenliği ve performansı ile ilgilenir.

**JPA , uygulama ile veritabanı arasında arabirim noktasını oluşturur.**

**JPA hem Java SE hem de Java EE için kullanılabilir bir teknolojidir.**

Çeşitli implementasyonları da mevcuttur.Hibernate de bir JPA implementasyonudur. JPA teknolojisi ile ORM üzerinde belli
bir standartın oluşturulması hedeflenmiştir.

JPA map işlemini belli kurallar çerçevesinde yapar. Bu işlemi yaparken kendi meta datalarını kullanır. Bağlantı ve 
kuralları oluşturduğu `persistence.xml` dosyası ile tutar. Bu dosya içerisinde veritabanı bağlantısı bilgileri, tablo 
oluşturma metodları gibi bilgiler bulunur.

#### JPA’ in avantajları nelerdir?

JPA kullanarak veritabanında bağımsız uygulamalar geliştirmek mümkündür. Küçük ayarlamalar ile uygulama farklı 
bağlantılara entegre edilebilir. Verilerin kalıcılığı sağlanmış olur. Veritabanı bağımsızlığı sayesinde uygulamanın 
mobilitesi gelişmiş olur. Veri işlemleri sırasında yüksek performans sağlar. Büyük ölçekli ve uzun süre kullanılacak projelerde yükseltme ve bakım işlemlerinin yapılmasını kolaylaştırır.

JPA’da önemli kavramlardan birisi de Entity dir. Entity veritabanımız ile yazılımımız arasında ilişki kurmasını 
sağlayan nesnelerdir. Bu nesneler kalıcı olmak zorundadır. Java Persistence API‘nin çalıştırdığı nesne Entity’dir. Tüm 
işleri yapan bu nesnemizdir. Arama, silme işlemlerini de yöneterek yapabilmekteyiz.
