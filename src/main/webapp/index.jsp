<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projeto calculadora</title>
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form method="post" action ="PrimeiroServlet">
<h1>Calculadora</h1>
  <div class="mb-3 col-3">
    <label for="exampleInputEmail1" class="form-label">Valor 1 :</label>
    <input type="number" name="alg1" >
    
  </div>
  <div class="mb-3 col-3" >
    <label for="exampleInputPassword1" class="form-label">Valor 2 :</label>
    <input type="number" name="alg2">
  </div>
 
  <button type="reset" class="btn btn-secondary">Limpar</button>
  <button type="submit" class="btn btn-secondary" name="somar"class="btn btn-secondary">+</button>
  <button type="submit" class="btn btn-secondary" name="subtrair"class="btn btn-secondary">-</button>
  <button type="submit" class="btn btn-secondary" name="multiplicar" class="btn btn-secondary">x</button>
  <button type="submit" class="btn btn-secondary" name="dividir"class="btn btn-secondary">/</button>
  
  <h2>Resultado = ${requestScope.res}</h2>
  </form>
  </div>

</body>
</html>
