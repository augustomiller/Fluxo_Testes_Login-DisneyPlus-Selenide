# Casos de testes - Fluxo DisneyPlus 🎬

<div text align="center">
  
## Fluxo de testes com Selenide e Selenium Web Driver
  
</div>
  
![Home 2021-08-25 at 05 09 13](https://user-images.githubusercontent.com/990877/130764847-688c1eb8-bce7-41c1-85e9-e163a8add655.png)

#

## Cenários:
  
| CN-1 - Login fluxo de sucesso - Chrome  |   |   |
|:-:|---|---|
|  CN-1.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso ✓  |
|  CN-1.B | Abrir uri  | https://www.disneyplus.com/pt-br ✓  |
|  CN-1.C | Validar se  utilizador está autenticado | Valida autenticação ✓
 


#
 
| CN-2 - Login senha inválida - Chrome  |   |   |
|:-:|---|---|
|  CN-2.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso ✓  |
|  CN-2.B | Abrir uri  | https://www.disneyplus.com/pt-br/login ✓  |
|  CN-2.C | Validar se  utilizador não está autenticado | Senha inválida ✓

  
#

| CN-3 - Login usuário não cadastrado - Chrome  |   |   |
|:-:|---|---|
|  CN-3.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso ✓  |
|  CN-3.B | Abrir uri  | https://www.disneyplus.com/pt-br/login ✓  |
|  CN-3.C | Validar se  utilizador não está cadastrado | Usuário inválido ✓


#

| CN-4 - Login usuário é obrigatório - Chrome  |   |   |
|:-:|---|---|
|  CN-4.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso ✓  |
|  CN-4.B | Abrir uri  | https://www.disneyplus.com/pt-br/login ✓  |
|  CN-4.C | Validar se campo utilizador está pupulado | Campo usuário é obrigatório ✓
   

#

| CN-5 - Login senha é obrigatório - Chrome  |   |   |
|:-:|---|---|
|  CN-5.A | Abrir o navegador Google Chrome  | Navegador abre com sucesso ✓  |
|  CN-5.B | Abrir uri  | https://www.disneyplus.com/pt-br/login ✓  |
|  CN-5.C | Validar se campo senha está pupulado | Campo senha é obrigatório ✓

   
##

![Screen Shot 2021-08-25 at 05 09 13](https://user-images.githubusercontent.com/990877/130752845-cd4b2ee6-7ae7-45b7-8e48-ac240ddd8f6e.png)
