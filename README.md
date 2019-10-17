## Prerrequisites

If you want to download and run the source code, it is necessary to have installed java 1.8 and Apache Maven 3.6.0  on the computer where the program will run.

## Architecture

This is the architecture that the lab has.
The user is going to connect to our web application through the internet. The spark web application is located in a virtual machine on AWS. When the user enters the data, the application will communicate to the math services through Amazon API Gateway, then the service communicates with the lambda function, and this function will return the square of the entered value.

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/Architecture.png)

## Running the project

To download the project dependencies the following line must be executed.
```
mvn clean compile assembly:single
```

To execute the project
```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.services.SparkWebApp"
```

To open the website locally go to
```
http://localhost:4567/Beta
```

Execute this line to see the java documentation.
```
mvn javadoc:jar
```

## Testing

This is the result testing the square lambda function on AWS.
![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingSquareServiceInLambda.PNG)

This is the method that is going to allow the connection between the web application and the API Gateway on AWS.

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/ConnectingToAPIGateway.PNG)

These are the tests when we already deployed the project on the virtual machine and connected the web application with the API gateway, and the API gateway with the Lambda function.

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingWebSite1.PNG)

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingWebSite2.PNG)

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingWebSite3.PNG)

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingWebSite4.PNG)

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingWebSite5.PNG)

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingWebSite6.PNG)

![](https://github.com/jcamilovelandiab/AmazonGateway-Lambda-SparkWebApp/blob/master/images/TestingWebSite7.PNG)

## Author

Juan Camilo Velandia Botello - Escuela Colombiana de Ingeniería Julio Garavito, Colombia.

## License

This project is under the Apache license - see [LICENSE](LICENSE.md) for more details.
