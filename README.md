## Desafio - Padrões de Projetos na prática com Java

Este é um projeto de exemplo em Java que demonstra o uso dos padrões de projeto Factory e Adapter. O projeto simula um sistema de controle remoto universal que pode ligar e desligar diferentes tipos de dispositivos, como TVs e DVD players, usando esses padrões de projeto.

### Factory Pattern

O Factory Pattern é usado para criar objetos sem expor a lógica de criação diretamente ao cliente. No projeto, usei o Factory Pattern para criar diferentes tipos de dispositivos, como TVs e DVD players, sem que o cliente precise conhecer detalhes de implementação.

### Adapter Pattern

O Adapter Pattern é usado para permitir que classes com interfaces incompatíveis trabalhem juntas. No projeto, usei o Adapter Pattern para adaptar diferentes dispositivos a uma interface comum (UniversalRemoteControl), facilitando o controle de ligar e desligar.

________________________________________________________________________________________________________________________
### Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
