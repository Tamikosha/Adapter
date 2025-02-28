package com.example.demo.adapter;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
public class FindTaskByIdMappingSqlQuery extends MappingSqlQuery<TaskData>
        implements FindTaskByIdSpi {
    public FindTaskByIdMappingSqlQuery(DataSource dataSource) {
        super(dataSource, "SELECT * FROM t_task WHERE id = :id"); // Передаем SQL-запрос
        declareParameter(new SqlParameter("id", Types.VARCHAR)); // Описываем параметры
    }

    // Метод целевого интерфейса
    @Override
    public Optional<TaskData> findTaskById(UUID id) {
        TaskData task = this.findObjectByNamedParam(Map.of("id", id));
        return Optional.ofNullable(task); // Оборачиваем результат в Optional
    }

    @Override
    protected TaskData mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new TaskData(rs.getObject("id", UUID.class));
    }
}
