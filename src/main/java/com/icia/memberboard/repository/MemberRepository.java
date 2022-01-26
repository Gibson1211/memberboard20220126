package com.icia.memberboard.repository;

import com.icia.memberboard.dto.MemberDetailDTO;
import com.icia.memberboard.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<MemberEntity, Long> {
    MemberEntity findByMemberEmail(String memberEmail);

//    MemberDetailDTO mypage(long memberId);
//    boolean existsByEmail(String memberEmail);


}
