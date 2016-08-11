# IBMi-Mule-SSL
This repository contains a source code for IBM i Mule SSL configuration blog article as well as developer preview of AS400 Connector v1.0.1 that enables SSL support. To install the connector, download the zip file then use Anypoint studio's Install new software option to install connector from archive.

To run the demo:
- complete the IBM i server SSL configuration
- export CA certificate to local truststore
- copy trust store to /src/main/app and set the file name and trust store password in the Spring bean configuration in demo app
- point the demo Mule application properties to your IBM i / AS400 server
- on IBM i side, create request and response data queues

      CRTDTAQ <data-queue-name> MAXLEN(255)  seq(*keyed) keylen(20)  

- start the demo
- on IBM i side, send test entry to the data queue with key = 1 and value USD,EUR using QSNDDTAQ IBM i API
- Mule should reply to response data queue with the exchange rate for this pair of currencies

For more information on how to setup SSL on IBM i server and Mule, refer to the blog article at http://www.infoviewsystems.com/blog/
