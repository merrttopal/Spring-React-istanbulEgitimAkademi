# istanbulEgitimAkademi eğitimi.


# Java and Spring Training

This repository is the result of the training I took to learn how to develop web applications with Java and Spring. In this course I covered the following topics:

## Java 8

Java 8 is one of the most popular versions of Java. New features have been added in this release, such as

- Lambda expressions: Anonymous functions that allow us to do functional programming.
- Stream API: An interface that allows us to perform parallel or sequential operations on collections.
- Optional: A class we can use to prevent null values.
- Date and Time API: A new API that makes it easier to handle date and time.

By using these features, I made my code more readable, performant and secure.

## Spring Boot 2.0

Spring Boot is a subset of the Spring Framework. With Spring Boot we can develop web applications quickly and easily. The advantages of Spring Boot are:

- Dependency management: With tools like Maven or Gradle we can add the dependencies we need to our project.
- Automatic configuration: Spring Boot automatically makes some settings according to the needs of our project, for example server port, database connection, security filters, etc.
- Launchers: Thanks to the initializers that Spring Boot offers, we can easily add the modules we want to our project, for example web, data, security, etc.
- Actuator: It is a tool provided by Spring Boot. It helps us monitor information such as the health, performance, metrics of our application.

By using Spring Boot, I was able to develop and run my projects faster and easier.

## Spring MVC

Spring MVC is a module of the Spring Framework. It is used to develop the presentation layer of web applications. The features of Spring MVC are:

- Model-View-Controller (MVC) architecture: Separates the layers of our application, allowing us to write more organized and maintainable code.
- Annotation-based programming: We can define and mark classes and methods using annotations in our code. For example @Controller, @RequestMapping, @Autowired etc.
- View technologies: Spring MVC supports different view technologies, e.g. JSP, Thymeleaf, FreeMarker etc. We can create dynamic web pages using these technologies.
- Data binding and validation: Spring MVC automatically binds form data to model objects and validates them according to standards such as JSR-303.
- Internationalization and localization: Spring MVC allows us to deliver our application in different languages and cultures. We can do this with tools such as message sources, local solvers and formatters.
- Exception handling: Spring MVC provides mechanisms to catch errors that may occur in our application and handle them appropriately. For example @ExceptionHandler, @ControllerAdvice, ErrorController, etc.

Using Spring MVC, I developed the presentation layer of my web applications and provided a user-friendly interface.

## Spring Data JPA

Spring Data JPA is a module of the Spring Framework. It is used to enhance the data access layer. Here are the features of Spring Data JPA:

- Java Persistence API (JPA): It is a standard used in Java to manage database related objects. With JPA we can define entity classes and map them to database tables.
- Repository abstraction: Spring Data JPA provides interfaces called repositories to perform database operations. Using these interfaces we can easily perform CRUD (create-read-update-delete) operations. We can also define query methods or write JPQL or SQL queries with @Query annotation.
- Paging and sorting: Spring Data JPA allows us to display data sets by paging or sorting them. We can do this using classes like Pageable and Sort.
- Auditing: Spring Data JPA helps us to automatically record the creation, update and deletion times of entity objects. We can do this by using annotations like @CreatedDate, @LastModifiedDate.

By using Spring Data JPA, I was able to improve my data access layer and communicate effectively with the database.

## Hibernate

Hibernate is one of the most popular ORM (Object-Relational Mapping) tools in Java. Hibernate is an implementation of JPA and can be used with Spring Data JPA. The advantages of Hibernate are:

- Performance: Hibernate offers various techniques to improve performance, such as caching, lazy loading, batch processing, etc.
- Dialects: Hibernate provides various dialects to work with different databases. For example MySQLDialect, OracleDialect, etc.
- HQL: Hibernate Query Language (HQL) is a query language similar to SQL. With HQL we can write queries on entity objects.
- Criteria API: Hibernate Criteria API is an interface that allows us to create queries in a programmatic way. With Criteria API we can write dynamic and flexible queries.

Using Hibernate, I took advantage of all the benefits of the ORM tool and simplified my database operations.

## H2 Database

H2 Database is a Java-based relational database. The features of H2 Database are:

- Embedded and server modes: H2 Database can run in embedded or server modes. In embedded mode, the database file is located inside the application and can only be accessed by the application. In server mode, the database file is located on a separate server and can be accessed by different applications.
- In-memory databases: H2 Database can create in-memory databases. In-memory databases store data in RAM and do not use disks. This makes them faster and more performant.
- Browser based console: H2 Database offers a web-based console. With this console we can connect to the database, view tables, write queries and process data.
- Compatibility: H2 Database can work with other popular databases. For example MySQL, PostgreSQL, Oracle, etc.

Using H2 Database, I was able to quickly and easily set up and test databases in my projects.

## JSP

JSP (Java Server Pages) is a Java-based image technology. With JSP we can create dynamic web pages. The features of JSP are:

- Scriptlets: In JSP pages we can write Java code between <% ... %> signs. These scripts run on the server side and return the result as HTML.
- Directives: In JSP pages we can write directives between the <%@ ... %> signs. These directives determine how the page behaves. For example @page, @include, @taglib etc.
- Expressions: In JSP pages we can write expressions between <%= ... %> signs. These expressions are evaluated on the server side and return the result as HTML.
- Tags: In JSP pages we can use tags like HTML. These tags determine the appearance of the web page. We can also use special tags, for example JSTL, EL, etc.

Using JSP, I was able to create my web pages dynamically and combine Java code and HTML.

## Bootstrap

Bootstrap is a popular CSS framework for web development. With Bootstrap we can design modern and responsive web pages. The advantages of Bootstrap are:

- Grid system: Bootstrap organizes the web page according to a 12-column grid system. This allows the web page to adapt to different screen sizes.
- Components: Bootstrap offers various components that we can add to the web page. For example navbar, carousel, modal, alert etc.
- Utilities: Bootstrap provides various utility classes (utilities) to adjust the appearance of the web page. For example margin, padding, color, display, etc.
- Icons: Bootstrap provides various icons that we can add to the web page. For example arrow, check, trash etc.

Using Bootstrap, I was able to easily design my web pages and provide a professional look.

## Maven

Maven is a tool for managing Java projects. With Maven, we can organize our projects according to a standard structure, manage our dependencies, and perform operations such as testing and packaging. Here are the features of Maven:

POM: Project Object Model (POM) is an XML file that defines the properties of our project. In this file we write the name of our project, version, dependencies, plugins, features, etc.
Lifecycle: Maven manages the lifecycle of our project according to specific phases. These phases are: validate, compile, test, package, install, deploy, etc. We can run these phases from the command line or from the IDE.
Repositories: Maven uses repositories to download the dependencies we need for our project. These repositories can be local, central or remote. A local repository is a folder on our computer. A central repository is a web address that Maven uses by default. A remote repository is another web address.
Plugins: Maven uses plugins to add additional features or functionality to our project. We can add these plugins to the POM file or run them from the command line. For example compiler-plugin, surefire-plugin, tomcat-plugin etc.
Using Maven I managed my projects in a standardized way and solved dependency issues.

## JPA Buddy

JPA Buddy is a plugin developed for IntelliJ IDEA. With JPA Buddy we can easily create, edit and synchronize JPA entity classes. Here are the features of JPA Buddy:

Database connection: JPA Buddy provides an interface to connect to the database. With this interface we can specify the database type, address, username, password and other settings.

Entity generation: JPA Buddy provides a tool to convert tables in the database into entity classes. With this tool we can select table names, column names, relationships, annotations and other properties.

Entity editor: JPA Buddy provides an editor for editing entity classes. With this editor we can change or add class names, field names, annotations and other properties.

Database synchronization: JPA Buddy provides synchronization between entity classes and the database. In this way, changes we make in the entity classes are reflected in the database or changes in the database are reflected in the entity classes.

Using JPA Buddy, I created my entity classes quickly and easily and kept them compatible with the database.


------------------------------------------------------------------------------------------------------------------------------------------------




# Java ve Spring Eğitimi

Bu repository, Java ve Spring ile web uygulamaları geliştirmeyi öğrenmek için aldığım eğitimin sonucudur. Bu eğitimde aşağıdaki konuları işledim:

## Java 8

Java 8, Java'nın en popüler sürümlerinden biridir. Bu sürümde yeni özellikler eklenmiştir, örneğin:

- Lambda ifadeleri: Fonksiyonel programlama yapmamıza olanak sağlayan anonim fonksiyonlar.
- Stream API: Koleksiyonlar üzerinde paralel veya sıralı işlemler yapmamızı sağlayan bir arayüz.
- Optional: Null değerleri önlemek için kullanabileceğimiz bir sınıf.
- Date and Time API: Tarih ve zaman ile ilgili işlemleri kolaylaştıran yeni bir API.

Bu özellikleri kullanarak kodumun daha okunabilir, performanslı ve güvenli olmasını sağladım.

## Spring Boot 2.0

Spring Boot, Spring Framework'ün bir alt kümesidir. Spring Boot ile hızlı ve kolay bir şekilde web uygulamaları geliştirebiliriz. Spring Boot'un avantajları şunlardır:

- Bağımlılık yönetimi: Maven veya Gradle gibi araçlarla projemize ihtiyacımız olan bağımlılıkları ekleyebiliriz.
- Otomatik yapılandırma: Spring Boot, projemizin ihtiyaçlarına göre otomatik olarak bazı ayarları yapar, örneğin sunucu portu, veritabanı bağlantısı, güvenlik filtreleri vb.
- Başlatıcılar: Spring Boot'un sunduğu başlatıcılar sayesinde projemize kolayca istediğimiz modülleri ekleyebiliriz, örneğin web, data, security vb.
- Actuator: Spring Boot'un sağladığı bir araçtır. Uygulamamızın sağlık durumu, performansı, metrikleri gibi bilgileri izlememize yardımcı olur.

Spring Boot'u kullanarak projelerimi daha hızlı ve kolay bir şekilde geliştirdim ve çalıştırdım.

## Spring MVC

Spring MVC, Spring Framework'ün bir modülüdür. Web uygulamalarının sunum katmanını geliştirmek için kullanılır. Spring MVC'nin özellikleri şunlardır:

- Model-View-Controller (MVC) mimarisi: Uygulamamızın katmanlarını ayırarak daha düzenli ve bakımı kolay bir kod yazmamızı sağlar.
- Annotation-based programming: Kodumuzda anotasyonları kullanarak sınıfları ve metodları tanımlayabilir ve işaretleyebiliriz. Örneğin @Controller, @RequestMapping, @Autowired vb.
- View technologies: Spring MVC, farklı görüntü teknolojilerini destekler, örneğin JSP, Thymeleaf, FreeMarker vb. Bu teknolojileri kullanarak dinamik web sayfaları oluşturabiliriz.
- Data binding and validation: Spring MVC, form verilerini otomatik olarak model nesnelerine bağlar ve JSR-303 gibi standartlara uygun olarak doğrulama yapar.
- Internationalization and localization: Spring MVC, uygulamamızı farklı dillerde ve kültürlerde sunmamızı sağlar. Mesaj kaynakları, yerel çözücüler ve biçimlendiriciler gibi araçlarla bunu yapabiliriz.
- Exception handling: Spring MVC, uygulamamızda oluşabilecek hataları yakalamak ve uygun şekilde işlemek için mekanizmalar sunar. Örneğin @ExceptionHandler, @ControllerAdvice, ErrorController vb.

Spring MVC'yi kullanarak web uygulamalarımın sunum katmanını geliştirdim ve kullanıcı dostu bir arayüz sağladım.

## Spring Data JPA

Spring Data JPA, Spring Framework'ün bir modülüdür. Veri erişim katmanını geliştirmek için kullanılır. Spring Data JPA'nın özellikleri şunlardır:

- Java Persistence API (JPA): Java'da veritabanı ile ilişkili nesneleri yönetmek için kullanılan bir standarttır. JPA ile entity sınıfları tanımlayabilir ve veritabanı tablolarına eşleyebiliriz.
- Repository abstraction: Spring Data JPA, veritabanı işlemlerini yapmak için repository adı verilen arayüzleri sağlar. Bu arayüzleri kullanarak CRUD (create-read-update-delete) işlemlerini kolayca yapabiliriz. Ayrıca sorgu metodları tanımlayabilir veya @Query anotasyonu ile JPQL veya SQL sorguları yazabiliriz.
- Paging and sorting: Spring Data JPA, veri setlerini sayfalara bölerek veya sıralayarak göstermemize olanak sağlar. Pageable ve Sort gibi sınıfları kullanarak bunu yapabiliriz.
- Auditing: Spring Data JPA, entity nesnelerinin oluşturulma, güncellenme ve silinme zamanlarını otomatik olarak kaydetmemize yardımcı olur. @CreatedDate, @LastModifiedDate gibi anotasyonları kullanarak bunu yapabiliriz.

Spring Data JPA'yı kullanarak veri erişim katmanımı geliştirdim ve veritabanı ile etkili bir şekilde iletişim kurabildim.

## Hibernate

Hibernate, Java'da en popüler ORM (Object-Relational Mapping) araçlarından biridir. Hibernate, JPA'nın bir uygulamasıdır ve Spring Data JPA ile birlikte kullanılabilir. Hibernate'in avantajları şunlardır:

- Performance: Hibernate, performansı arttırmak için çeşitli teknikler sunar, örneğin caching, lazy loading, batch processing vb.
- Dialects: Hibernate, farklı veritabanları ile uyumlu çalışmak için çeşitli lehçeler (dialects) sağlar. Örneğin MySQLDialect, OracleDialect vb.
- HQL: Hibernate Query Language (HQL), SQL'e benzer bir sorgu dilidir. HQL ile entity nesneleri üzerinde sorgular yazabiliriz.
- Criteria API: Hibernate Criteria API, programatik bir şekilde sorgular oluşturmamızı sağlayan bir arayüzdür. Criteria API ile dinamik ve esnek sorgular yazabiliriz.

Hibernate'i kullanarak ORM aracının sunduğu tüm avantajlardan yararlandım ve veritabanı işlemlerimi kolaylaştırdım.

## H2 Database

H2 Database, Java tabanlı bir ilişkisel veritabanıdır. H2 Database'in özellikleri şunlardır:

- Embedded and server modes: H2 Database, gömülü (embedded) veya sunucu (server) modlarında çalışabilir. Gömülü modda, veritabanı dosyası uygulamanın içinde yer alır ve sadece uygulama tarafından erişilebilir. Sunucu modda, veritabanı dosyası ayrı bir sunucuda yer alır ve farklı uygulamalar tarafından erişilebilir.
- In-memory databases: H2 Database, bellek içi (in-memory) veritabanları oluşturabilir. Bellek içi veritabanları, verileri RAM'de tutar ve disk kullanmaz. Bu sayede daha hızlı ve performanslı çalışır.
- Browser based console: H2 Database, web tabanlı bir konsol sunar. Bu konsol ile veritabanına bağlanabilir, tabloları görüntüleyebilir, sorgular yazabilir ve verileri işleyebiliriz.
- Compatibility: H2 Database, diğer popüler veritabanları ile uyumlu çalışabilir. Örneğin MySQL, PostgreSQL, Oracle vb.

H2 Database'i kullanarak projelerimde hızlı ve kolay bir şekilde veritabanı kurabildim ve test edebildim.

## JSP

JSP (Java Server Pages), Java tabanlı bir görüntü teknolojisidir. JSP ile dinamik web sayfaları oluşturabiliriz. JSP'nin özellikleri şunlardır:

- Scriptlets: JSP sayfalarında <% ... %> işaretleri arasında Java kodu yazabiliriz. Bu kodlar sunucu tarafında çalışır ve sonucu HTML olarak döndürür.
- Directives: JSP sayfalarında <%@ ... %> işaretleri arasında yönerge (directive) yazabiliriz. Bu yönergeler sayfanın nasıl davranacağını belirler. Örneğin @page, @include, @taglib vb.
- Expressions: JSP sayfalarında <%= ... %> işaretleri arasında ifade (expression) yazabiliriz. Bu ifadeler sunucu tarafında değerlendirilir ve sonucu HTML olarak döndürür.
- Tags: JSP sayfalarında HTML gibi etiketler (tags) kullanabiliriz. Bu etiketler web sayfasının görünümünü belirler. Ayrıca özel etiketler de kullanabiliriz, örneğin JSTL, EL vb.

JSP'yi kullanarak web sayfalarımı dinamik bir şekilde oluşturdum ve Java kodu ile HTML'i birleştirebildim.

## Bootstrap

Bootstrap, web geliştirme için popüler bir CSS framework'üdür. Bootstrap ile modern ve duyarlı (responsive) web sayfaları tasarlayabiliriz. Bootstrap'un avantajları şunlardır:

- Grid system: Bootstrap, web sayfasını 12 sütunlu bir ızgara sistemine göre düzenler. Bu sayede web sayfasının farklı ekran boyutlarına uyum sağlamasını sağlar.
- Components: Bootstrap, web sayfasına ekleyebileceğimiz çeşitli bileşenler (components) sunar. Örneğin navbar, carousel, modal, alert vb.
- Utilities: Bootstrap, web sayfasının görünümünü ayarlamak için çeşitli yardımcı sınıflar (utilities) sağlar. Örneğin margin, padding, color, display vb.
- Icons: Bootstrap, web sayfasına ekleyebileceğimiz çeşitli ikonlar (icons) sunar. Örneğin arrow, check, trash vb.

Bootstrap'u kullanarak web sayfalarımın tasarımını kolayca yapabildim ve profesyonel bir görünüm sağladım.

## Maven

Maven, Java projelerinin yönetimi için kullanılan bir araçtır. Maven ile projelerimizi standart bir yapıya göre düzenleyebilir, bağımlılıklarımızı yönetebilir, test ve paketleme gibi işlemleri yapabiliriz. Maven’in özellikleri şunlardır:

POM: Project Object Model (POM), projemizin özelliklerini tanımlayan bir XML dosyasıdır. Bu dosyada projemizin adı, versiyonu, bağımlılıkları, eklentileri, özellikleri vb. bilgileri yazarız.
Lifecycle: Maven, projemizin yaşam döngüsünü (lifecycle) belirli aşamalara göre yönetir. Bu aşamalar şunlardır: validate, compile, test, package, install, deploy vb. Bu aşamaları komut satırından veya IDE’den çalıştırabiliriz.
Repositories: Maven, projemize ihtiyacımız olan bağımlılıkları indirmek için depolar (repositories) kullanır. Bu depolar yerel (local), merkezi (central) veya uzak (remote) olabilir. Yerel depo, bilgisayarımızda bulunan bir klasördür. Merkezi depo, Maven’in varsayılan olarak kullandığı bir web adresidir. Uzak depo, başka bir web adresidir.
Plugins: Maven, projemize ek özellikler veya işlevler kazandırmak için eklentiler (plugins) kullanır. Bu eklentileri POM dosyasına ekleyebilir veya komut satırından çalıştırabiliriz. Örneğin compiler-plugin, surefire-plugin, tomcat-plugin vb.
Maven’i kullanarak projelerimi standart bir şekilde yönettim ve bağımlılık sorunlarını çözdüm.

## JPA Buddy

JPA Buddy, IntelliJ IDEA için geliştirilen bir eklentidir. JPA Buddy ile JPA entity sınıflarını kolayca oluşturabilir, düzenleyebilir ve senkronize edebiliriz. JPA Buddy’nin özellikleri şunlardır:

Database connection: JPA Buddy, veritabanına bağlanmak için bir arayüz sunar. Bu arayüz ile veritabanı tipini, adresini, kullanıcı adını, şifreyi ve diğer ayarları belirleyebiliriz.

Entity generation: JPA Buddy, veritabanındaki tabloları entity sınıflarına dönüştürmek için bir araç sunar. Bu araç ile tablo adlarını, sütun adlarını, ilişkileri, anotasyonları ve diğer özellikleri seçebiliriz.

Entity editor: JPA Buddy, entity sınıflarını düzenlemek için bir editör sunar. Bu editör ile sınıf adlarını, alan adlarını, anotasyonları ve diğer özellikleri değiştirebilir veya ekleyebiliriz.

Database synchronization: JPA Buddy, entity sınıfları ile veritabanı arasında senkronizasyon sağlar. Bu sayede entity sınıflarında yaptığımız değişiklikler veritabanına yansır veya veritabanındaki değişiklikler entity sınıflarına yansır.

JPA Buddy’yi kullanarak entity sınıflarımı hızlı ve kolay bir şekilde oluşturdum ve veritabanı ile uyumlu tuttum.




