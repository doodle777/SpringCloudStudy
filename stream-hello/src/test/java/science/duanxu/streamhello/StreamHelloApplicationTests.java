package science.duanxu.streamhello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import science.duanxu.streamhello.service.SinkSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamHelloApplicationTests {

	@Autowired
	private SinkSender sinkSender;

	@Test
	public void contextLoads() {
		sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
	}

}
