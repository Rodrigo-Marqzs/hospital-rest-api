-- testes-manuais
-- Documento para consulta de códigos para testes manuais feito no banco
-- Todos os dados utilizados nesse projeto são fictícios
-- O arquivo foi pensado para rodar num banco vazio, com as tabelas já criadas pela aplicação.

-- BLOCO 1
-- Ver conteúdo das tabelas paciente, medico e consulta

SELECT * FROM paciente;
SELECT * FROM medico;
SELECT * FROM consulta;

-- BLOCO 2
-- Inserir conteúdo das tabelas paciente, médico e consulta

INSERT INTO paciente (nome, cpf, email) VALUES ('Rodrigo', '00000000000', 'rodrigo@gmail.com');
INSERT INTO medico (nome, especialidade, crm) VALUES ('John Frusciante', 'Cardiologista', '1234');
INSERT INTO consulta (motivo, paciente_id, medico_id) VALUES ('dor no peito', 1, 1);

-- BLOCO 3
-- Na tabela paciente atualizar o e-mail do paciente id 1 por um e-mail fictício
-- Ver conteúdo da tabela paciente

UPDATE paciente SET email = 'digas@gmail.com' WHERE id = 1;
SELECT * FROM paciente;

-- BLOCO 4
-- Teste para acessar paciente não existente
-- Falha esperada pelo motivo de não existir o paciente com id 99
-- Mensagem de erro esperada "violates foreign key constraint e Key (paciente_id)=(99) is not present"
-- Esse comando deve ser executado separadamente, porque o erro desfaz os blocos anteriores se rodarem juntos.

INSERT INTO consulta (motivo, paciente_id, medico_id) VALUES ('dor no peito', 99, 1);


