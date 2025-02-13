DALITypes DM
===========================

This is a prototype VO-DML model definition of data types defined by [DALI](https://www.ivoa.net/documents/DALI/20230712/WD-DALI-1.2-20230712.html#tth_sEc3)

To validate the model
```shell
./gradlew vodmlValidate
```

to build code based on the model and run tests
```shell
./gradlew test
```

should build the documentation site and make it available at http://localhost:8000
```shell
./gradlew testSite
```
         
The above depends on running having some [external dependencies installed](https://ivoa.github.io/vo-dml/Installation/#external-dependencies).