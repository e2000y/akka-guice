## Changelogs
we use [Semantic Versioning](http://semver.org/)

##### v3.2.0
+ update akka 2.5.4, scala 2.11.11 & 2.12.3
+ move source code to github.com/ohze/akka-guice
+ building settings change:
  - update sbt 1.0.1, sbt-sonatype 2.0, sbt-pgp 1.1.0
  - use sbt-coursier
  - use sbt-scalafmt-coursier instead of sbt-scalariform

##### v3.1.3
+ update akka 2.4.6, scala 2.11.8 & 2.12.0-M4
+ add travis test for openjdk8

##### v3.1.2
+ update akka 2.4.2
+ update sbt 0.13.11 & some sbt plugins

##### v3.1.1
+ cross compile to scala 2.11.7, 2.12.0-M3
+ update akka 2.4.1

##### v3.1.0
+ update sbt 0.13.9, akka 2.4.0 (drop support for java7, scala 2.10)

##### v3.0.0
+ make ActorProducer `private[akuice]`
+ remove trait ActorFactory, AssistedActorProducer. Should use AkkaGuiceSupport.bindActorFactory instead
+ add dependency: guice-assistedinject

##### v2.0.1
update scala 2.11.5, akka 2.3.8

##### v2.0.0
remove `trait TopActorInject`. use `injectTopActor` method to inject top actor

##### v1.2.0
+ cross compile to scala 2.10.4 & 2.11.4
+ make `TopActorInject.actorSystem` a `final def` to fix [a invalid error highlight in Intellij](https://youtrack.jetbrains.com/issue/SCL-7924)

##### v1.1.0
 Support Assisted Inject Actor

##### v1.0.0
 First release