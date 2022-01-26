<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container ">
        <div class="row mt-5 mb-5">
          <div class="col-12 col-md-5 mx-auto border">
            <div class="white">
              <div class="row">
                <div class="col-12">
                  <h2 class="title-main">Calculadora</h2>
                </div>
                    <form method="post" action="WBProjetoTriangulo">
                       <div class="row">
                           <div class="col-3 mt-2">
                               <h6>Numero 1:</h6>
                           </div>
                           <div class="col-9">
                               <input type="text" class="form-control" name="val1">
                           </div>
                       </div>
                       <div class="row mt-3">
                            <div class="col-3 mt-2">
                                <h6>Numero 2:</h6>
                            </div>
                            <div class="col-9">
                                <input type="text" class="form-control" name="val2">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-3 mt-2">
                                <h6>Numero 3:</h6>
                            </div>
                            <div class="col-9">
                                <input type="text" class="form-control" name="val3">
                            </div>
                        </div>
    
                        <div class="row">
                            <div class="align-items-center mt-3 mb-3">
                                <button type="submit" class="btn btn-secondary col-4">Resultado</button>
        
                                <button type="reset" class="btn btn-secondary col-4">Limpar</button>
                            </div>
                        </div> 
                    </form>              
                </div>
              </div>
            </div>
          </div>
        </div>
</body>
</html>