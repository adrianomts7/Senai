from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from contextlib import contextmanager

# Parâmetros para conexão com o banco de dados MySql
db_user = "user"
db_password = "user_password"
db_host = "localhost"
db_port = "3306"
db_name = "meu_banco"

# URL da conexão para o banco de dados MYSQL
DATABASE_URL = f"mysql+pymysql://{db_user}:{db_password}@{db_host}:{db_port}/{db_name}"

# Conectando ao banco de dados
db = create_engine(DATABASE_URL)
Session = sessionmaker(bind=db)
session = Session()

@contextmanager
def get_db():
    db = Session()

    try:
        yield db
        db.commit()
    except Exception as erro:
        db.rollback()
        raise erro
    finally:
        db.close()