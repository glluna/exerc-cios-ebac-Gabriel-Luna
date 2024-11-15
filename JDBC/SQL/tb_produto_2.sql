create sequence sq_produto_2
start 1
increment 1
owned by TB_PRODUTO_2.ID;

create table TB_PRODUTO_2(
	ID BIGINT,
	NOME VARCHAR(50) not null,
	CODIGO VARCHAR(50) not null,
	CONSTRAINT pk_ID_PRODUTO_2 primary key (ID)
);

select * from TB_PRODUTO_2;
delete from TB_PRODUTO_2;
