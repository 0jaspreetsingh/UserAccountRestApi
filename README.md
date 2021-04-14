# UserAccountRestApi

## About

Spring boot rest api. <br>

## Angular Front-end github link

https://github.com/0jaspreetsingh/UserAccountDashboard

## Database

My Sql 8 (use docker image for my sql)

## Docker steps

1. docker pull mysql <br>
2. docker network create app_network <br>
3. docker run -d -it --network app_network -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test_database --name mysql_name mysql <br>
4. docker pull 0jaspreet/useraccountrestapi <br>
5. docker run --network app_network -p 5000:5000 -e CONNECTION_STRING="jdbc:mysql://mysql_name:3306/test_database" -e USERNAME="root" -e PASSWORD="root" 0jaspreet/useraccountrestapi -it 


