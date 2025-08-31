# Padrão de Projeto: Singleton

O padrão **Singleton** é um dos padrões de projeto criacionais mais utilizados. Seu principal objetivo é garantir que uma classe tenha **apenas uma única instância** durante toda a execução da aplicação e fornecer um **ponto global de acesso** a essa instância.

---

## 🧠 Conceito

- **Instância única**: apenas um objeto da classe será criado.
- **Acesso global**: qualquer parte da aplicação pode acessar a instância.
- **Controle de criação**: o construtor é privado e o acesso é feito por um método estático.

---

## ✅ Quando usar?

- Gerenciadores de configurações globais.
- Conexões com banco de dados.
- Loggers (sistemas de log).
- Serviços que devem ser instanciados uma única vez.

---

## 💡 Exemplo

### Classe Singleton

```java
public class Singleton {
    // Instância estática da própria classe
    private static Singleton instancia;

    // Construtor privado para impedir instanciamento externo
    private Singleton() {}

    // Método público que retorna a instância única
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Exemplo de método da classe
    public void executar() {
        System.out.println("Executando ação com Singleton!");
    }
}
