let amigos = [anthony, analy, bruna, fernanda]
  function sortearAmigo() {
    // Verifica se há amigos disponíveis
    if (amigos.length === 0) {
        alert("A lista de amigos está vazia. Adicione pelo menos um nome.");
        return;
    }

    // Gera um índice aleatório
    const indice = Math.floor(Math.random() * amigos.length);

    // Obtém o nome sorteado
    const nomeSorteado = amigos[indice];

    // Exibe o resultado na interface
    const resultado = document.getElementById("resultado");
    resultado.innerHTML = `🎉 Amigo sorteado: <strong>${nomeSorteado}</strong>`;
}
