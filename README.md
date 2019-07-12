CrudSpringDocket.

PREMISSA Desenvolver um CRUD de cartórios utilizando as seguintes tecnologias: JSP, Spring MVC e JPA/Hibernate.
Neste sistema o cartório possui, além do ID, um nome.
É obrigatório os seguintes requisitos:
    • Criar cartório
    • Editar cartório
    • Visualizar cartório
    • Excluir cartório
    • Listar cartórios
    • Serviço REST que retorne todos cartórios /cartorios
    
   •Optei por usar o BD em memório H2 pela simplicidade (não ter que instalar Postgres/MYSQL, etc.), mas o código é facilmente adaptável a qualquer outro DB (Estou usando JPA com hibernate).
   •Para acessar a aplicação vá para http://localhost:8080/ .


