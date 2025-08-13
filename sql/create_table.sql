CREATE TABLE IF NOT EXISTS product_transaction (
    id BIGINT PRIMARY KEY,
    product_id VARCHAR(20) NOT NULL,
    product_name VARCHAR(100) NOT NULL,
    amount INT NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    status TINYINT NOT NULL,
    transaction_date DATETIME NOT NULL,
    create_by VARCHAR(100) NOT NULL,
    create_on DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS status_lookup (
    id TINYINT PRIMARY KEY,
    name VARCHAR(20) NOT NULL
);
