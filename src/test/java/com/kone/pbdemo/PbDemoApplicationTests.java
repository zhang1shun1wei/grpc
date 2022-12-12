package com.kone.pbdemo;

import com.kone.pbdemo.common.dto.UserDTO;
import com.kone.pbdemo.protocol.FileServiceGrpc;
import com.kone.pbdemo.protocol.User;
import com.kone.pbdemo.protocol.UserServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

@SpringBootTest(classes = PbDemoApplication.class)
class PbDemoApplicationTests {

	@GrpcClient("userClient")
	private UserServiceGrpc.UserServiceBlockingStub userService;

	@GrpcClient("userClient")
	private FileServiceGrpc.FileServiceBlockingStub fileService;

	@Test
	void contextLoads() {
		User user = User.newBuilder()
				.setUsername("username")
				.setName("name")
				.setUserId(100)
				.putHobbys("pingpong", "play pingpong")
				.setCode(200)
				.build();

		// 测试Protobuf对象和DTO之间转换
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		System.out.println(userDTO);

		System.out.println("get response-------->");
		System.out.println(userService.getUser(user));

		System.out.println(this.fileService.getFile(user));

		Iterator<User> users = this.userService.getUsers(user);
		while (users.hasNext()) {
			System.out.println(users.next());
		}
	}

}
