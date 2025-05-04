# Implementação da Feature

A implementação da feature foi feita de forma simples mas funcional.  
A primeira tentativa foi feita com um Enum chamado `Estatura` para representar as estaturas possíveis (`BAIXO`, `MEDIANO`, `ALTO`).  
Porém, ao tentar persistir a informação no banco de dados, percebeu que o valor do Enum era armazenado como um número inteiro (0, 1, 2), o que não era o esperado, já que você queria salvar como String (por exemplo, "BAIXO", "MEDIANO", "ALTO").

### Exemplo inicial:

```java
if (altura <= 1.20) {
    estatura = Estatura.BAIXO;
} else if (altura >= 1.21 && altura <= 1.70) {
    estatura = Estatura.MEDIANO;
} else {
    estatura = Estatura.ALTO;
}
```

---

A solução foi simples e funcional: você substituiu o Enum por uma variável do tipo `String`, atribuindo valores como "baixo", "mediano" e "alto" diretamente, com base na altura do hominídeo.  
Isso resolveu o problema, pois a variável agora é salva como String no banco de dados, e a operação lógica de forma mais direta.

### Exemplo final:

```java
if (hominideo.altura < 1.60) {
    hominidio.setEstatura = "baixo";
} else if (hominideo.altura >= 1.60 && hominidio.setAltur <= 1.80) {
    hominidio.setEstatura = "mediano";
} else {
    hominidio.setEstatura = "alto";
}
```

---

# Considerações Finais

A polida com `try-catch` no código final foi feita com o auxílio de inteligência artificial.  
Acredito que tenha ficado funcional.

