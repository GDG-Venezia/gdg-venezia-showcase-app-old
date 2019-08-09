# Kotlin Multiplatform Showcase App


## Setup
- creare il file local.properties e inserire la property `sdk.dir=<path to android sdk>`

## Architettura
L'architettura è basata su clean architecture e MVP.
La parte comune contiene:
- modelli (in `domain/entities`)
- usecase (in `domain/usecases`)
- repository (interfaccia contenuta in `domain` e implementazione contenuta in `data` secondo la filosofia della clean architecture, in modo da supportare una eventuale futura separazione dei layer in diversi moduli)
- presenter (in `presentation`)
- interfacce delle view (in `presentation`)
I componenti grafici di Android e iOS saranno responsabili di implementare le interfacce delle view definite nella parte comune.

## Riferimenti
- [Documentazione ufficiale](https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html)
- https://github.com/Kotlin/mpp-example
- https://proandroiddev.com/clean-architecture-example-with-kotlin-multiplatform-c361bb283fd0
- https://github.com/Syex/MoviesMPP

## iOS

To compile the project from Xcode just open `iosApp/iosApp.xcodeproj` and run the application.
The [swift tests](iosApp/iosAppTests/iosAppTests.swift) also can be executed from Xcode.

To compile a framework for ios simulator from the command line execute:

```
  > ./gradlew :app:build
```

To compile the framework for a device use the `device` project property:

```
  > ./gradlew :app:build -Pdevice=true
```

To run kotlin tests (including the [common ones](app/src/commonTest/kotlin/CalculatorTest.kt))
on an iOS simulator execute:

```
  > ./gradlew :app:iosTest
```

By default the `iPhone 8` simulator is used. One can change this setting using the `iosDevice` project property:

```
  > ./gradlew :app:iosTest -PiosDevice='iPhone 7'
```


## Android

The application can be built and executed on a device or emulator using Android Studio 3.2 or higher.
One can also compile the application and run tests from the command line:

```
   > ./gradlew :androidApp:build
```
