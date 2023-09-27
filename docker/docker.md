# Docker

---

> O Docker é uma tecnologia de virtualização de contêineres que permite empacotar aplicativos e suas dependências em unidades isoladas, chamadas contêineres, para facilitar o desenvolvimento, implantação e escalabilidade de aplicativos de forma eficiente e portátil. Isso ajuda a garantir a consistência, eficiência e portabilidade dos aplicativos em diferentes ambientes de implantação.

----

## Contêiners

> Um contêiner, no contexto de tecnologia de contêineres como o Docker, é uma unidade leve e isolada que contém um aplicativo, suas dependências e todo o ambiente necessário para que o aplicativo seja executado de maneira consistente em diferentes sistemas e ambientes.
>
> Esses contêineres são baseados em uma tecnologia de virtualização de nível de sistema operacional que isola processos e recursos do sistema, permitindo que vários contêineres compartilhem o mesmo sistema operacional host. Cada contêiner inclui sua própria pilha de sistema de arquivos, bibliotecas e configurações, tornando-o independente e auto-suficiente.
>
> ### Maquina virtual:
>
> ![](./imgs/maquina-virtual.png)
>
> ---
>
> ### Containers:
>
> ![](./imgs/container-vm.png)
>
> ![containers](./imgs/containers.png)
>
> ---
>
> ### Namespaces
>
> Um namespace é um recurso do kernel Linux usado para isolar e encapsular processos e recursos de sistema. Essa tecnologia é fundamental para a implementação de containers, pois permite que diferentes containers compartilhem o mesmo kernel, mas operem de forma isolada. Os namespaces ajudam a criar um ambiente mais seguro e eficiente para a execução de aplicativos em contêineres. Aqui estão alguns dos namespaces principais utilizados pelo Docker:
>
> 1. **Namespace de Processos (PID):**
>    - **Objetivo:** Isola o espaço de processos, de modo que os processos em um namespace PID não podem ver ou interferir nos processos fora desse namespace.
>    - **Docker Option:** `--pid`
> 2. **Namespace de Rede (NET):**
>    - **Objetivo:** Isola a pilha de rede, permitindo que cada contêiner tenha seu próprio conjunto de interfaces de rede, tabelas de roteamento e firewalls.
>    - **Docker Option:** `--net`
> 3. **Namespace de Sistema de Arquivos (MNT):**
>    - **Objetivo:** Isola os sistemas de arquivos, permitindo que cada contêiner tenha seu próprio sistema de arquivos raiz.
>    - **Docker Option:** `--mount` ou `-v` (para montar volumes)
> 4. **Namespace de Hostname (UTS):**
>    - **Objetivo:** Isola o hostname do contêiner, fornecendo a ilusão de um host independente para cada contêiner.
>    - **Docker Option:** `--hostname`
> 5. **Namespace de Usuário (USER):**
>    - **Objetivo:** Isola os IDs de usuário e grupo, permitindo que um contêiner tenha seus próprios intervalos de IDs de usuário.
>    - **Docker Option:** `--user`
> 6. **Namespace de IPC (Inter-Process Communication):**
>    - **Objetivo:** Isola as estruturas de IPC, como filas de mensagens e semáforos, proporcionando isolamento entre contêineres.
>    - **Docker Option:** `--ipc`
> 7. **Namespace de Dispositivos (DEV):**
>    - **Objetivo:** Isola o acesso a dispositivos, restringindo quais dispositivos o contêiner pode acessar.
>    - **Docker Option:** `--device`
> 8. **Namespace de Cgroups (CGROUP):**
>    - **Objetivo:** Isola os recursos do sistema, como CPU, memória e dispositivos de E/S, usando control groups (cgroups).
>    - **Docker Option:** As opções relacionadas a cgroups são gerenciadas implicitamente pelo Docker.
>
> ---
>
> ### Cgroup
>
> Cgroups (Control Groups) são uma funcionalidade no kernel Linux que permite a alocação, controle e monitoramento de recursos do sistema, como CPU, memória e I/O, entre grupos de processos. Essa tecnologia é crucial para a implementação de contêineres, permitindo a criação de ambientes isolados e a definição de limites de recursos para garantir eficiência e segurança. No contexto do Docker, cgroups são usados para controlar e limitar os recursos consumidos por cada contêiner.

----

## DockerHub

> O Docker Hub é um serviço da Docker que funciona como um registro centralizado para imagens de contêineres. Ele permite o armazenamento, compartilhamento e distribuição de imagens Docker, tanto públicas quanto privadas. Os desenvolvedores usam o Docker Hub para colaborar, acessar imagens prontas, e integrar facilmente suas aplicações em contêineres a diferentes ferramentas e serviços.



-----

## Comandos Uteis

> - ***docker ps*** ou ***docker container ls*** => Exibe quais conteiners estão em execucao.
> - ***docker ps -a*** ou ***docker container ls -a*** => Exibe todos os conteiners (ativos ou nao).
> - ***docker pull <imagem>*** => Baixa a inagem do dockerHub.
> - ***docker stop <nome ou id container>*** => Para a execucao do container resetando todos os processos.
> - ***docker stop -t=0 <nome ou id container>*** => Para a execucao do container estantaneamente resetando todos os processos.
> - ***docker  pause <nome ou id container>*** => Para a execucao do container mas mantem todos os processos.
> - ***docker  unpause <nome ou id container>*** => Volta a execucao do container.
> - ***docker start <nome container>*** =>  Execuca o container.
> - ***docker stop $(docker ps -q)*** => Para parar todos os contêineres em execução.
> - ***docker rm $(docker ps -aq)*** => Para remover todos os contêineres (parados e em execução) 
> - ***docker exec -it <id no container> <comando>*** => Para interagir com o containers de forma interativa.
> - ***docker run -it <iamgem> bash*** => Para subir o container e já executar o bash interativo.
>
> O `docker run` cria um novo container e o executa. O `docker exec` permite executar um comando em um container que já está em execução.
>
> 
