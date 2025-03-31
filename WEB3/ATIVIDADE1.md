## ATIVIDADE AVALIATIVA

### Lista de Exercícios 1

#### 1. Quais protocolos (os principais) são usados em uma comunicação realizada na web? Descreva muito brevemente o papel de cada um deles.
_Hyper Text Transfer Protocol -> HTTP: para comunicação entre navegadores e servidores web, define como as requisicoes e repostas sao feitas para acessar paginas web;
HyperText Transfer Protocol Secure -> HTTPS: versao segura do HTTP...
Domain Name System -> DNS: responsavel por traduzir os nomes de dominio por nos para endereços IP que a máquina entenda :D_


#### 2. Alguns autores usam o termo “arquitetura da web” para se referir a como as camadas tecnológicas da web estão organizadas e aos princípios que definem a troca de informações entre essas camadas. Por questões didáticas e de simplificação, convencionou-se chamar essa arquitetura de “arquitetura cliente x servidor” ou arquitetura “requisição x resposta”. Explique de forma simplificada como funciona essa arquitetura.
_Bom é bem o que se fala mesmo, a grosso modo um *cliente* (eu, voce, alguem) navega na internet e envia um pedido (requisição) como um pagina, ou imagem; o *servidor* recebe seu pedido, processa e traz de volta o que voce pediu (a pagina/imagem ou infromação (resposta)), assim cada vez que acessamos algo na web, é como se estivesse fazendo um novo pedido e recebendo uma nova resposta, ta aí: cliente x servidor = requisicao x resposta = "pedido x entrega"_


#### 3. Em uma arquitetura web, qual o papel desempenhado pelo protocolo HTTP?
_Hyper Text Transfer Protocol -> HTTP; um tipo de protocolo “Cliente e Servidor” ou “Requisição e Resposta”; orientado a recursos; interface muito bem definida:
	Um verbo para cada tipo de requisição
	Um código de estado para cada resposta;
	Regras bem definidas para trocas de mensagens._

#### 4. O HTTP possui padrões uniformes para requisição e para resposta.
a) Dê ao menos três exemplos métodos de requisição e suas características;
_GET: Solicida dados de ums ervidor, é visivel na URL.
POST: Envia dados par ao servidor, cria ou atualiza recursos, usando por exemplo quando preenchemos e enviamos um formulario e/ou login.
PUT: Atualiza ou substitui um recurso no servidor, ao contrario do POST ue cria/atualiza parcialmente, substitui todo o recurso, por exemplo atualizar info de um perfil de usuario em um sistema._


b) Dê ao menos três exemplos status de respostas e quando ocorrem;
_Status Code: (200 (sucesso),
404 (recurso não localizado,
500 (erro nos servidor (erro no código que o servidor não consegue interpretar))) https://http.cat/_

#### 5. Em uma arquitetura web é sempre o cliente quem inicia o processo de comunicação: o cliente requisita, o servidor responde. Contudo, aplicações web como Gmail ou Instagram, “empurram” informações novas ao cliente, tais como um novo e-mail ou uma “curtida” em uma determinada publicação. Hipoteticamente, quais estratégias poderiam ser empregadas para se chegar a esse resultado?
_Penso que as de Notificação Push aqueles alertas em aplicativos moveis por exemplo, atualizações de feed por exemplo em redes sociais..._
