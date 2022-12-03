## DTO, DAO, POJO/Bean ve JavaBean Nedir ve Nerelerde Kullanılır?
##### DAO(Data Access Object): 
Genellikle veri tabanı üzerinde yapılacak işlemleri yüklenen sınıflardır. DAO içine database işlemlerimizi yazıp 
programda karışıklık önlenmiş yada azaltılmış olur ve ayrıca tekrar tekrar 
kullanmanın(code reuse) önünü açarız.
Örneğin:
````
public class UserDAOService{
public boolean addUser(){
// some codes here
}

... // some codes here
}
````

UserDAOService sınıfımız artık tüm user işlemlerini yükleniyor. Gidipte başka işlemler yaptığımız kod parçacıkları 
arasına SQL komutları sıkıştırıp işimizi zorlaştırmayacağız.
-----
##### DTO(Data Transfer Object): 
Adından anlaşılacağı üzere bu objeler katmanlar, birimler arasında sadece veri aktarımı için kullanılırlar. 
(DB ve JVM arasında örneğin , JVM-JVM arasında)

1. Depolama dışında herhangi bir yükümlülükleri yoktur. 
2. Setter/getter kullanmına gerek yoktur. 
3. Tüm veriler public olarak tutulabilir.
-----
##### JavaBean: 
JavaBean dediğimiz objeler veri tutma amaçlı kullanılırlar. Bir objenin JavaBean olarak sayılabilmesi için 3 
şartı sağlaması gereklidir.

1. Serializable olmalı. 
2. Parametresiz yapıcı metodu olmalı.(No parameter constructor)
3. Public setter/getter metodlarına sahip olmalı 
4. Teknolojinin gelişmesiye verilerimizi artık dosyalarda(text dosyasında örneğin) değilde veri tabanları üzerinde 
tutuyoruz. Bunun için Serializable olarak implement etme yöntemi pek kullanılmıyor. Bu 
durumlarda Bean/POJO kullanımı daha yaygın görülür. 
-----
##### POJO/Bean(Plain Old Java Object): 
Bu obje de veri depolamak için kullanılırlar. JavaBean den farklı herhangi bir zorlamaya sahip değildir. 
Örneğin kullanıcı bilgilerini tutacağımız bir objeye UserBean diyebiliriz.
````
public class UserBean{
private String name;
private String password;

    public UserBean(){} // no parameter constructor
    // add other constructors

    public String getName(){return name;}
    public void setName(String name){this.name = name};

    // some codes here
}
````
Özellikle java tabanlı projelerde bu isimleri yada paketleme isimlerini bolca görmekteyiz.

Böylelikle hem karışmaları engelleriz. İstediğimizi daha çabuk ayırt ederiz hem de kod tekrarlarının önüne bir nebze 
geçmiş oluruz.

