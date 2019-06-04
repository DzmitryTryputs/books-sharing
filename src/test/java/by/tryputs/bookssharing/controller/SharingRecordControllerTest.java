package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.AbstractSpringMvcTest;
import by.tryputs.bookssharing.dto.sharing.SharingRecordDto;
import by.tryputs.bookssharing.mock.SharingRecordMock;
import by.tryputs.bookssharing.service.SharingRecordService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class SharingRecordControllerTest extends AbstractSpringMvcTest {

    @Mock
    private SharingRecordService sharingRecordService;

    @Autowired
    @InjectMocks
    private SharingRecordController sharingRecordController;

    @Test
    public void add() throws Exception {
        SharingRecordDto sharingRecordDto = SharingRecordMock.getSharingRecordDto();
        Mockito.when(sharingRecordService.orderBook(1L)).thenReturn(sharingRecordDto);

        getMockMvc().perform(MockMvcRequestBuilders.post("/api/sharingrecords/order")
                .param("cardId","1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().json(toJson(sharingRecordDto)));

    }

    @Test
    public void back() throws Exception {
        SharingRecordDto sharingRecordDto = SharingRecordMock.getSharingRecordDto();
        Mockito.doNothing().when(sharingRecordService).returnBook(1L);

        getMockMvc().perform(MockMvcRequestBuilders.post("/api/sharingrecords/return")
                .requestAttr("cardId", 1L))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
