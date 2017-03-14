# MOE Bindings

## Table of Contents

* [Configuration](#configuration)
    * [Xcode Project](#xcode-project)
* [Publish](#publish)

## Configuration

### Xcode Project

Xcode project can be configured as follows:

```bash
cd <repo>/<module-name>/xcode
pod install
```

## Publish

Build and publish _release_ version to Maven local repository:

```bash
cd <repo>
./gradlew :<module-name>:publishMavenJavaPublicationToMavenLocal
```

Build and publish _snapshot_ version to Maven local repository:

```bash
cd <repo>
./gradlew :<module-name>:publishMavenJavaSnapshotPublicationToMavenLocal
```

Build and publish _release_ version to Bintray:

```bash
cd <repo>
./gradlew :<module-name>:bintrayUpload \
    -Pbintray.user=user \
    -Pbintray.key=key
```

Build and publish _snapshot_ version to Artifactory:

```bash
cd <repo>
./gradlew :<module-name>:artifactoryPublish \
    -Partifactory.url=url \
    -Partifactory.key=key \
    -Partifactory.user=user \
    -Partifactory.pass=pass
```
