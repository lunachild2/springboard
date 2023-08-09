package org.lunachild.repositories;

import org.lunachild.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface MemberRepository extends JpaRepository<Member, Long>,
        QuerydslPredicateExecutor<Member> {
}
