    private static Long getIdByColumnName(Class<? extends AbstractAuditingEntity<Long>> entityClass, String columnName,
                                          Long columnValue, EntityManager entityManager) {
        var criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<? extends AbstractAuditingEntity<Long>> root = criteriaQuery.from(entityClass);
        criteriaQuery.select(root.get("insertUserId"));
        criteriaQuery.where(criteriaBuilder.equal(root.get(columnName), columnValue));
        TypedQuery<Long> query = entityManager.createQuery(criteriaQuery);
        return query.getSingleResult();
    }
