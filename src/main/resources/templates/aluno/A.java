package templates.aluno;

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <div th:replace="fragments/config :: confragment"></div>

    <title>Novo aluno</title>
</head>


<body>
<div class="container">

    <div th:replace="fragments/header :: cabecalho"></div>


    <div class="row">
        <div class="col-md-6">
            <h2>Cadastro de Alunos</h2>
        </div>
        <div class="col-md-6 d-flex justify-content-end">
            <a th:href="@{/aluno/}" type="button" class="btn btn-primary">Listagem</a>
        </div>
    </div>
    <hr>
    <br>


    <div th:if="${mensagem}" class="alert alert-success alert-dismissible fade show" role="alert">
        <span th:text="${mensagem}"></span>
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>

    <form th:action="@{/aluno/salvar}" th:object="${aluno}" method="post">

        <div class="card mb-3">
            <div class="card-header">
            Dados Pessoais
        </div>
            <div class="card-body">
                <div class="row mb-3">
                <label for="nome" class="col-sm-2 col-form-label">Nome</label>
                    <div class="col-sm-10">
                        <input th:field="*{nome}" type="text" class="form-control" id="nome">
                        <span class="mensagem" th:if="${#fields.hasErrors('nome')}" th:errors="*{nome}"></span>
                </div>
            </div>
                <div class="row mb-3">
                    <label for="cpf" class="col-sm-2 col-form-label">CPF</label>
                    <div class="col-sm-10"> <input th:field="*{cpf}" type="text" class="form-control" id="cpf">
                        <span class="mensagem" th:if="${#fields.hasErrors('cpf')}" th:errors="*{cpf}"></span>
                </div>
                </div>
                <div class="row mb-3">
                    <label for="matricula" class="col-sm-2 col-form-label">Matrícula</label>
                    <div class="col-sm-10"> <input th:field="*{matricula}" type="text" class="form-control" id="matricula">
                        <span class="mensagem" th:if="${#fields.hasErrors('matricula')}" th:errors="*{matricula}"></span>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="email" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10"> <input th:field="*{email}" type="text" class="form-control" id="email">
                        <span class="mensagem" th:if="${#fields.hasErrors('email')}" th:errors="*{email}"></span>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="dataNascimento" class="col-sm-2 col-form-label">Data Nasc.</label>
                    <div class="col-sm-10">
                        <input th:field="*{dataNascimento}" type="date" class="form-control" id="dataNascimento">
                        <span class="mensagem" th:if="${#fields.hasErrors('dataNascimento')}" th:errors="*{dataNascimento}"></span>
                    </div>
                </div>
            </div>
        </div>

        <div class="card mb-3">
            <div class="card-header">
            Endereço
        </div>
            <div class="card-body">
                <div class="row mb-3">
                <label class="col-sm-2 col-form-label">CEP</label>
                    <div class="col-sm-10">
                        <input th:field="*{endereco.cep}" type="text" class="form-control" th:id="cep" onblur="pesquisacep(this.value);">
                        <span class="mensagem" th:if="${#fields.hasErrors('endereco.cep')}" th:errors="*{endereco.cep}"></span>
                    </div>
            </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">Logradouro</label>
                    <div class="col-sm-10">
                        <input th:field="*{endereco.logradouro}" type="text" class="form-control" th:id="logradouro">
                        <span class="mensagem" th:if="${#fields.hasErrors('endereco.logradouro')}" th:errors="*{endereco.logradouro}"></span>
                    </div>
                </div>
                <div class="row mb-3">
                    <label  class="col-sm-2 col-form-label">Complemento</label>
                    <div class="col-sm-10">
                        <input th:field="*{endereco.complemento}" type="text" class="form-control" th:id="complemento">
                        <span class="mensagem" th:if="${#fields.hasErrors('endereco.complemento')}" th:errors="*{endereco.complemento}"></span>
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">Bairro</label>
                    <div class="col-sm-10"> <input th:field="*{endereco.bairro}" type="text" class="form-control" th:id="bairro">
                        <span class="mensagem" th:if="${#fields.hasErrors('endereco.bairro')}" th:errors="*{endereco.bairro}"></span>
                    </div>
                </div>
                <div class="row mb-3">
                    <label  class="col-sm-2 col-form-label">Cidade</label>
                    <div class="col-sm-10">
                        <input th:field="*{endereco.cidade}" type="text" class="form-control" th:id="cidade">
                        <span class="mensagem" th:if="${#fields.hasErrors('endereco.cidade')}" th:errors="*{endereco.cidade}"></span>
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">UF</label>
                    <div class="col-sm-10"> <input th:field="*{endereco.uf}" type="text" class="form-control" th:id="uf">
                        <span class="mensagem" th:if="${#fields.hasErrors('endereco.uf')}" th:errors="*{endereco.uf}"></span>
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label">Número</label>
                    <div class="col-sm-10">
                        <input th:field="*{endereco.numero}" type="text" class="form-control" th:id="numero">
                        <span class="mensagem" th:if="${#fields.hasErrors('endereco.numero')}" th:errors="*{endereco.numero}"></span>
                    </div>
                </div>

            </div>
        </div>


        <button type="submit" class="btn btn-primary">Gravar</button>
    </form>
</div>

<div th:replace="fragments/footer :: rodape"></div>

</body>
</html>