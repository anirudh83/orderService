# orderService
part of order management system service

###Step 1 : Configure Postgres Database using docker
```bash
$ docker run --name oms_postgres -p 5432:5432 -e POSTGRES_USER=dbuser -e POSTGRES_DB=orders_db -e POSTGRES_PASSWORD=password -d postgres
```
Note : if the container is already running :
```bash
$ docker start oms_postgres 
```
To create orders_db :
```bash
docker exec -it 5328f411af86 psql -d postgres -U dbuser -c "CREATE DATABASE orders_db;"
docker exec -it 5328f411af86 psql -d postgres -U dbuser -c "GRANT ALL PRIVILEGES ON DATABASE orders_db TO dbuser;"
```
Once the DB is up and running configure its details in application.properties file

####Build
```bash
./gradlew build
```

###Run
```bash
./gradlew bootRun
```
docker exec -it 5328f411af86 psql -d postgres -U dbuser