<h1 align="center">Café  API</h1>

![Badge Concluído](https://img.shields.io/static/v1?label=Status&message=Desenvolvendo&color=red&style=for-the-badge)
![Badge Java](https://img.shields.io/static/v1?label=Java&message=21&color=orange&style=for-the-badge&logo=java)
![Badge Spring](https://img.shields.io/static/v1?label=SpringBoot&message=v3.3.1&color=brightgreen&style=for-the-badge&logo=SpringBoot)

## Resumo do projeto

Uma api para pessoas que gostam de café e frases aleatorias! O principal intuito dessa api é entender melhor e estudar como utilizar 
Spring openFeign e fazer traduções com a inteligencia artificial do google a gemini.

## Funcionalidades

- `Index`: Te mostra uma pagina com uma imagem de um cafezinho e uma frase aleatoria traduzida pela IA. Atraves do **GET localhost:8080/**


## Construir a aplicação
Tecnologias necessarias `Java` e `Maven`

Primeiro Clone o repositorio
```
    git clone https://github.com/jvictornascimento/cafe-intelectual.git    
```
Depois com o mavem montamos e subimos a api.    
  ```
    mvn clean install&&mvn spring-boot:run
  ```

Após subir a aplicação, acesse <http://localhost:8080/>.

## Tecnologias

- `Intellij`
- `Java 21`
- `Maven`
- `Spring Boot, Spring openFeign, Spring Web, `
- `Thymeleaf`

## Atualizações futuras
- [ ] Deixar o index mais bonito e padronizado.
- [x] Fazer as Traduções das frases para o português com a inteligência artificial do google Gemini.
- [ ] Hospedar ela em algum serviço de nuvem (estudo).
