-- Criação da tabela de fornecedores
CREATE TABLE IF NOT EXISTS suppliers (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    cnpj TEXT NOT NULL,
    contact TEXT NOT NULL
);
-- Tabela de cestas básicas
CREATE TABLE IF NOT EXISTS basic_baskets (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    amount INTEGER NOT NULL,
    price REAL NOT NULL,
    expiry_date TEXT NOT NULL,
    supplier_id INTEGER,
    FOREIGN KEY(supplier_id) REFERENCES suppliers(id)
);

-- Tabela de caixas
CREATE TABLE IF NOT EXISTS boxes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    amount INTEGER NOT NULL,
    validate TEXT NOT NULL,
    price REAL NOT NULL
);