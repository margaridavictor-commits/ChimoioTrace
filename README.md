# ChimoioTrace

## Descrição do Projeto

ChimoioTrace é uma aplicação móvel desenvolvida para promover a rastreabilidade agrícola na região de Chimoio, Moçambique. A plataforma permite aos produtores agrícolas registar e gerir lotes de produção, enquanto os consumidores podem rastrear a origem dos produtos através de códigos QR, garantindo transparência e confiança na cadeia alimentar.

## Funcionalidades Principais

- **Rastreabilidade**: Registo detalhado de lotes agrícolas com informações sobre produção, localização e datas.
- **Dashboard do Produtor**: Interface para produtores gerirem os seus lotes, visualizar estatísticas e aceder a ferramentas de gestão.
- **Mapa de Origem**: Visualização geográfica da origem dos produtos, com coordenadas baseadas em Chimoio para demonstração (pode ser refinado para usar localizações reais do Firestore).
- **Códigos QR**: Geração e leitura de códigos QR para facilitar o rastreio pelos consumidores.
- **Integração com Firebase**: Armazenamento de dados em Firestore para sincronização em tempo real.

## Funcionalidades em Desenvolvimento

- **Consultor Inteligente**: Integração de IA básica para fornecer dicas de cultivo e informações sobre preços aos produtores.
- **Histórico de Compras**: Módulo para consumidores visualizarem o histórico das suas compras rastreadas.
- **Módulo de Vendas**: Painel para produtores gerirem vendas diretamente na aplicação.

## Tecnologias Utilizadas

- **Linguagem**: Kotlin
- **Framework**: Android SDK
- **Banco de Dados**: Firebase Firestore
- **Autenticação**: Firebase Auth
- **Mapa**: Google Maps API (ou similar)
- **Outros**: QR Code generation library

## Instalação e Configuração

1. Clone o repositório:
   ```
   git clone https://github.com/margaridavictor-commits/ChimoioTrace.git
   ```

2. Abra o projeto no Android Studio.

3. Configure o Firebase:
   - Adicione o seu projeto Firebase no [Firebase Console](https://console.firebase.google.com/).
   - Baixe o arquivo `google-services.json` e coloque na pasta `app/`.
   - Ative Firestore e Authentication no console.

4. Execute o projeto no emulador ou dispositivo.

## Capturas de Ecrã

*(Adicione capturas de ecrã aqui quando disponíveis)*

## Contribuição

Contribuições são bem-vindas! Por favor, abra uma issue ou pull request para discutir mudanças.

## Licença

Este projeto está licenciado sob a MIT License.

## Contacto

Para mais informações, contacte [seu email ou nome].

---

*Nota: Este README é uma versão inicial. Pode ser expandido com mais detalhes técnicos, diagramas e instruções específicas.*