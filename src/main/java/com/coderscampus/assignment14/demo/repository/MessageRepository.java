package com.coderscampus.assignment14.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.dto.messageDto;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{
	@Query(value ="SELECT * FROM MESSAGES WHERE channel_Id = ?", nativeQuery = true)
	List<Message> findAllByChannelId(Long channelId);
}
