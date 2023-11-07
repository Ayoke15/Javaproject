# Используем официальный образ MySQL
FROM mysql:5.7

# Устанавливаем переменные окружения (по желанию)
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=your_database_name
ENV MYSQL_USER=your_username
ENV MYSQL_PASSWORD=your_password

# Копируем SQL скрипт в специальную папку внутри контейнера,
# которая автоматически исполняет все SQL скрипты при старте контейнера
COPY datapa.sql /docker-entrypoint-initdb.d/
