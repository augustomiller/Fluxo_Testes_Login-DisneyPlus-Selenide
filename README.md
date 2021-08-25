# Casos de testes - Fluxo DisneyPlus 🎬

<div text align="center">
  
## Fluxo de testes com Selenide e Selenium Web Driver
  
</div>
  
![Home 2021-08-25 at 05 09 13](https://user-images.githubusercontent.com/990877/130764847-688c1eb8-bce7-41c1-85e9-e163a8add655.png)

#

## Cenários 📸

<div text align="center">
  
### Cenário 1 ⇢ Login fluxo de sucesso ⎬ Chrome
  
<a href="https://user-images.githubusercontent.com/990877/130768388-4f9911c5-be81-4766-9e57-7c0db801a65d.png"/><img alt="evidencia1" src="https://img.shields.io/badge/evidence-IO-green"/></a>
</div>
  
| CN-1 Login fluxo de sucesso - Chrome  |   |   |
|:-:|---|---|
|  CN-1.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso  |
|  CN-1.B | Abrir uri  | https://www.disneyplus.com/  |
|  CN-1.C | Validar se  utilizador está autenticado | Valida autenticação

#
#

<div text align="center">
  
### Cenário 2 ⇢ Login senha inválida ⎬ Chrome
  
<a href="https://user-images.githubusercontent.com/990877/130779171-b794ee15-c712-4d14-8dfe-f99702c10247.png"/><img alt="evidencia2" src="https://img.shields.io/badge/evidence-IO-green"/></a>
</div>

| CN-2 Login senha inválida - Chrome  |   |   |
|:-:|---|---|
|  CN-2.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso  |
|  CN-2.B | Abrir uri  | https://www.disneyplus.com/login  |
|  CN-2.C | Validar se  utilizador não está autenticado | Senha inválida

  
#
#

<div text align="center">
  
### Cenário 3 ⇢ Login usuário não cadastrado ⎬ Chrome
  
<a href=""/><img alt="evidencia3" src="https://img.shields.io/badge/evidence-IO-green"/></a>
</div>

| CN-3 Login usuário não cadastrado - Chrome  |   |   |
|:-:|---|---|
|  CN-3.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso  |
|  CN-3.B | Abrir uri  | https://www.disneyplus.com/login  |
|  CN-3.C | Validar se  utilizador não está cadastrado | Usuário inválido


#
#

<div text align="center">
  
### Cenário 4 ⇢ Login usuário é obrigatório ⎬ Chrome
  
<a href=""/><img alt="evidencia4" src="https://img.shields.io/badge/evidence-IO-green"/></a>
</div>


| CN-4 Login usuário é obrigatório - Chrome  |   |   |
|:-:|---|---|
|  CN-4.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso  |
|  CN-4.B | Abrir uri  | https://www.disneyplus.com/login  |
|  CN-4.C | Validar se campo utilizador está pupulado | Campo usuário é obrigatório
   

#
#

<div text align="center">
  
### Cenário 5 ⇢ Login senha é obrigatório ⎬ Chrome
  
<a href=""/><img alt="evidencia5" src="https://img.shields.io/badge/evidence-IO-green"/></a>
</div>

| CN-5 Login senha é obrigatório - Chrome  |   |   |
|:-:|---|---|
|  CN-5.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso  |
|  CN-5.B | Abrir uri  | https://www.disneyplus.com/login  |
|  CN-5.C | Validar se campo senha está pupulado | Campo senha é obrigatório

#
