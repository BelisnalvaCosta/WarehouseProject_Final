let estoque = [];
let fornecedores = [];

function showSection(id) {
    document.querySelectorAll('.section').forEach(sec => sec.classList.remove('active'));
    document.getElementById(id).classList.add('active');
    if (id === 'estoque') renderEstoque();
    if (id === 'fornecedores') renderFornecedores();
}

function adicionarCesta(event) {
    event.preventDefault();
    const preco = document.getElementById('preco').value;
    const validade = document.getElementById('validade').value;
    const fornecedor = document.getElementById('fornecedor').value;

    estoque.push({ preco, validade, fornecedor });

    if (!fornecedores.includes(fornecedor)) {
        fornecedores.push(fornecedor);
    }

    alert("Cesta adicionada!");
    document.querySelector('form').reset();
    showSection('estoque');
}

function renderEstoque() {
    const container = document.getElementById('listaEstoque');
    container.innerHTML = "";
    estoque.forEach((cesta, index) => {
        container.innerHTML += `<div><strong>#${index + 1}</strong> - R$ ${cesta.preco} | Validade: ${cesta.validade} | Fornecedor: ${cesta.fornecedor}</div>`;
    });
}

function renderFornecedores() {
    const container = document.getElementById('listaFornecedores');
    container.innerHTML = "";
    fornecedores.forEach((forn, index) => {
        container.innerHTML += `<div><strong>#${index + 1}</strong> - ${forn}</div>`;
    });
}