CREATE TABLE schema_product.product (
    product_id SERIAL PRIMARY KEY,
    category_name VARCHAR(255) NOT NULL,
    product_name VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    stock INT,
    price NUMERIC ,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255) DEFAULT 'system',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_by VARCHAR(255) DEFAULT 'system'
);