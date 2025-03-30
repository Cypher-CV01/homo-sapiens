# Estatura dos hominídeos

### Regras para classificação de hominídeos por estatura

Esta regra de negócio tem por objetivo classificar os diferentes tipos de hominídeos em 3 catregorias:
- baixo
- mediano
- alto

Cada hominídeo deve estar categorizado em um desses três grupos, respeitando as características de sua espécie.

#### Denisovano
Um denisovano será categorizado em um dos três grupos conforme os intervalos de altura a seguir:

- baixo: até 1,40m
- mediano: entre 1,41m e 1,70m
- alto: a partir de 1,71m

#### Habilis
Os Homo Habilis devem ser categorizados respeitando os seguintes intervalos de estatura:

- baixo: até 1,40m
- mediano: entre 1,41m e 1,70m
- alto: a partir de 1,71m

#### Florisiense
Indivíduos da espécie Florisiense deve estar enquadrados nas categorias de acordo com estes números:

- baixo: até 0,50m
- mediano: entre 0,51m e 0,80m
- alto: a partir de 0,81m

#### Neandertal
Os Neandertais serão classificados em quanto a sua estatura conforme estes intervalos:

- baixo: até 1,20m
- mediano: entre 1,21m e 1,70m
- alto: a partir de 1,71m


## Requisitos Gerais
- Ao salvar ou editar um hominídeo, a categorização de estatura deve ser persistida no banco de dados. 
- Todos os hominídeos devem possuir a informação de categoria de estatura.
- Esta categoria de estatura deve estar em um campo novo na tabela Homo.
- Os únicos três valores possíveis para categoria de estatura são:
  -- baixo,
  -- mediano;
  -- alto.

