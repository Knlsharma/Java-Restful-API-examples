# Java-Restful-API-examples

These are simple and easily understandable code written in Java to implement restful API using [jersey jars](https://drive.google.com/drive/folders/1z8mTRDwf9MF_L1Sq0fpXcivhHJrqMhOV)

We can download and upload text files, image files, pdf files, excel files in java by JAX-RS API. To do so we need to write few lines of code only. Here, we are using _jersey_ implementation for developing **JAX-RS file** examples.
You need to specify different content type to download different files. The @Produces annotation is used to specify the type of file content.


* @Produces("text/plain"): for downloading text file.
* @Produces("image/png"): for downloading png image file.
* @Produces("application/pdf"): for downloading PDF file.
* @Produces("application/vnd.ms-excel"): for downloading excel file.
* @Produces("application/msword"): for downloading ms word file.

