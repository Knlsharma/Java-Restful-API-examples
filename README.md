# Java-Restful-API-examples

**RESTful JAX-RS File Download Example**

We can download text files, image files, pdf files, excel files in java by JAX-RS API. To do so we need to write few lines of code only. Here, we are using jersey implementation for developing JAX-RS file download examples.
You need to specify different content type to download different files. The @Produces annotation is used to specify the type of file content.

* @Produces("text/plain"): for downloading text file.
* @Produces("image/png"): for downloading png image file.
* @Produces("application/pdf"): for downloading PDF file.
* @Produces("application/vnd.ms-excel"): for downloading excel file.
* @Produces("application/msword"): for downloading ms word file.

