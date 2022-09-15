#language: pt
#encoding: UTF-8

@Login
Funcionalidade:  Realizar Login

@LoginCorreto
Cenario: Autenticacao Correta
Dado que o usuario faca o login no Sistema com os dados validos
Entao o Sistema devera apresentar a pagina principal

@LoginDadosIncorreto
Cenario: Autenticacao com os dados Incorretos
Dado que o usuario faca o login no Sistema com os dados invalidos
Entao o Sistema deverar apresentar a mensagem MS001

@LoginSemPreencherPassword
Cenario: Autenticacao sem preenchimento do campo Password
Dado que o usuario faca o login no Sistema sem preencher o campo Password
Entao o Sistema devera apresentar a mensagem MS002

@LoginSemPreencherUsername
Cenario: Autenticacao sem preenchimento do campo Username
Dado que o usuario faca o login no Sistema sem preencher o campo Username
Entao o Sistema devera apresenta a mensagem MS002

