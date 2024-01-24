## Qu'est-ce que l'ORM ?

---

+ Le « mappage objet-relationnel ou ORM » est la technique de programmation permettant de mapper les objets du modèle d'application aux tables de base de données relationnelles.
+ `Hibernate` est un outil `ORM` basé sur Java qui fournit un cadre pour mapper les objets du domaine d'application à la table de base de données relationnelle et vice versa.

# Qu'est-ce que `JPA`

---

+ L'API Java Persistance (JPA) est le standard Java pour mapper des objets Java à des bases de données relationnelles.
+ `JPA` est une spécification et plusieurs implémentations sont disponibles. Les implémentations populaires sont Hibernate, EclipseLink et Apache OpenJPA.
+ Les spécifications `JPA` sont définies avec des annotations dans un package `javax.persistance`. L'utilisation des annotations `JPA` nous aide à écrire du code indépendant de l'implémentation.

# Qu'est-ce que la mise en veille prolongée?

---

+ `Hibernate` est un outil `ORM` basé sur Java qui fournit un cadre pour mapper les objets du domaine d'application à la table de base de données relationnelle et vice-versa.
+ Il fournit une implémentation de référence de l'API Java Persistance, ce qui en fait un excellent choix en tant qu'outil ORM avec les avantages du couplage lâche.
+ Site officiel d'Hibernate à : https://hibernate.org/orm



## Hibernate Core Components

---

>> **Configuration**
> 
>> **SessionFactory**
> 
>> **Session**
> 
>> **Transaction**
> 
>> **Query**
> 
>> **First-level cache**
> 
>> **Persistent objects**
> 
>> **Second-level cache**


## Hibernate Benefits

----

# Avantages de la mise en veille prolongée

+ `Hibernate` élimine tout le code passe-partout fourni avec `JDBC`.

+ Prise en charge des annotations `XML` et `JPA`

+ `Hibernate` fournit un puissant langage de requête `(HQL)`.

+ `Hibernate` est facile à intégrer avec d'autres frameworks `Java EE`.

+ `Hibernate` prend en charge l'intégration paresseuse à l'aide d'objets proxy.

+ Le cache `Hibernate` nous aide à obtenir de meilleures performances.

+ Pour une fonctionnalité spécifique au fournisseur de base de données.

# **Quels sont les avantages de**

+ `Hibernate` supprime une grande partie du code standard fourni avec `JDBC API`.
+ `Hibernate` prend en charge l'héritage, les associations et les collections.
+ L'implicite `Hibernate` assure la gestion des transactions.
+ Gestion des exceptions.
+ `HQL`.
+ `Hibernate` prend en charge la mise en cache.
+ Création automatique de tableaux.

# **Exemple de mise en veille prolongée**

+ Créez une application `Hibernate` en utilisant la configuration `hibernate.cfg.xml` pour connecter la base de données `MySQL`.
+ Créez une application `Hibernate` en utilisant la configuration Java sans utiliser `hibernate.cfg.xml` pour connecter la base de données `MySQL`.

# Étapes de développement

+ Créez un projet `Maven` simple.
+ Structure du répertoire de projets
+ Ajouter les dépendances `jar` à `pom.xml`
+ Création de la `Classe d'entité JPA (classe persistante)`
+ Créez un fichier de configuration `Hibernate` - `hibernate.cfg.xml`.
+ Créer une « classe » d'utilitaire « Hibernate ».
+ Créez la classe `Main` et exécutez une application

# **Tools and technologies used**

+ Hibernate 6+
+ IDE - IntelliJ/Eclipse
+ Maven - 4
+ JavaSE - 11
+ MySQL - 8.0.33


