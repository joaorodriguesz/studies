

# Estrutura de Diretórios

------

**Filesystem Hierarchy Standard (FHS)** é uma referência que descreve as convenções usadas para o layout de um sistema UNIX. Tornou-se popular por seu uso em distribuições Linux, mas também é usado por outras variantes do UNIX. É mantido pela Linux Foundation.

![](./imgs/linux-filesystem-hierarchy.png)

---------

## < / > (RAIZ)

> *É o ponto de partida para toda a hierarquia de diretórios no sistema Linux.*
>
> > **/bin** (*binary*): Contém comandos essenciais do sistema, que são necessários para a inicialização e recuperação do sistema, mesmo que outros sistemas de arquivos não estejam montados.
> >
> > **/boot**: Contém arquivos relacionados ao processo de inicialização do sistema, como o kernel do Linux, imagens de inicialização e configurações do GRUB (Gerenciador de Inicialização do Grand Unified Bootloader).
> >
> > **/dev** (*devices*): Contém arquivos de dispositivo, que representam dispositivos físicos ou virtuais no sistema, como discos rígidos, unidades USB, interfaces de rede etc.
> >
> > **/etc**: Armazena arquivos de configuração do sistema e dos aplicativos. Configurações globais, arquivos de rede, informações de segurança, entre outros, são armazenados aqui.
> >
> > **/home**: Diretório pessoal dos usuários. Cada usuário normalmente tem uma pasta dentro deste diretório para armazenar seus arquivos pessoais.
> >
> > **/lib** e **/lib64** e outras lib: Bibliotecas compartilhadas essenciais para o sistema e aplicativos.
> >
> > **/media**: Ponto de montagem padrão para dispositivos removíveis, como CDs, DVDs, pen drives etc.
> >
> > **/mnt**: Diretório para montar temporariamente sistemas de arquivos adicionais.
> >
> > **/opt**: É usado para instalar software de terceiros ou pacotes adicionais. Muitas vezes, os aplicativos comerciais são instalados neste diretório.
> >
> > **/proc**: Fornece informações e estatísticas sobre processos em execução e configuração do sistema, apresentados como arquivos e diretórios virtuais.
> >
> > **/root**: Diretório pessoal do superusuário (root). Diferente do diretório /home, que é para usuários regulares.
> >
> > **/run**: É um diretório temporário utilizado para armazenar dados variáveis e temporários em sistemas Linux modernos. Ele é frequentemente montado como um sistema de arquivos tmpfs, que é uma sistema de arquivos baseado em RAM, o que significa que os dados são armazenados na memória RAM em vez de em um dispositivo de armazenamento permanente, como um disco rígido.
> >
> > **/sbin**: Contém comandos do sistema usados para administração e manutenção do sistema.
> >
> > **/snap**: O diretório raiz para a montagem de sistemas de arquivos Snap. Ele contém subdiretórios para cada pacote Snap instalado no sistema.
> >
> > **/srv**: Contém dados que são servidos por este sistema, geralmente para serviços como HTTP, FTP, etc.
> >
> > **/sys**: é uma parte fundamental do sistema de arquivos em sistemas Linux que fornece uma interface para interagir com e controlar informações sobre o kernel (núcleo do sistema operacional), dispositivos e configurações do sistema em tempo de execução. 
> >
> > **/tmp**: Diretório para arquivos temporários criados por aplicativos e processos.
> >
> > **/usr**: Contém a maioria dos programas, bibliotecas e arquivos de dados do sistema.
> >
> > **/var**: Armazena dados variáveis, como logs, arquivos de cache, spool de impressão, entre outros.



