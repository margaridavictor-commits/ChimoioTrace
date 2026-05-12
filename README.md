# ChimoioTrace

## Descrição do Projecto

ChimoioTrace é uma aplicação móvel desenvolvida para promover a rastreabilidade agrícola em Chimoio, Moçambique. A plataforma permite aos produtores agrícolas registar e gerir lotes de produção, enquanto os consumidores podem rastrear a origem dos produtos através de códigos QR, garantindo transparência e confiança na cadeia alimentar.

## Funcionalidades Principais

- **Rastreabilidade**: Registo detalhado de lotes agrícolas com informações sobre produção, localização e datas.
- **Dashboard do Produtor**: Interface para produtores gerirem os seus lotes, visualizarem estatísticas e acederem a ferramentas de gestão.
- **Mapa de Origem**: Visualização geográfica da origem dos produtos, com coordenadas baseadas em Chimoio para fins de demonstração (pode ser refinada para usar as localizações reais do Firestore).
- **Códigos QR**: Geração e leitura de códigos QR para facilitar o rastreamento pelos consumidores.
- **Integração com Firebase**: Armazenamento de dados no Firestore para sincronização em tempo real.

## Funcionalidades em Desenvolvimento

- **Consultor Inteligente**: Integração de IA básica para fornecer dicas de cultivo e informações sobre preços aos produtores.
- **Histórico de Compras**: Módulo para que os consumidores visualizem o histórico de suas compras.
- **Módulo de Vendas**: Painel para produtores gerirem as vendas diretamente na aplicação.

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
   - Adicione o seu projecto do Firebase no [Firebase Console](https://console.firebase.google.com/).
   - Baixe o arquivo `google-services.json` e coloque-o na pasta `app/`.
   - Ative Firestore e Authentication no console.

4. Execute o projeto no emulador ou no dispositivo.

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
