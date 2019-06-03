package by.tryputs.bookssharing.mock;

import by.tryputs.bookssharing.dto.sharing.SharingCardDto;
import by.tryputs.bookssharing.entity.SharingCard;
import by.tryputs.bookssharing.entity.SharingStatus;

public class SharingCardMock {

    public static SharingCard getSharingCardDbo() {
        SharingCard sharingCard = new SharingCard();
        sharingCard.setStatus(SharingStatus.VACANT);
        sharingCard.setOwner(UserMock.getUserDboMock());
        sharingCard.setBook(BookMock.getBookDboMock());
      //  sharingCard.setRecords();
        sharingCard.setId(1L);

        return sharingCard;
    }

    public static SharingCardDto getSharingCardDto() {
        SharingCardDto sharingCard = new SharingCardDto();
        sharingCard.setStatus(SharingStatus.VACANT);
        sharingCard.setUser(UserMock.getUserDtoMock());
        sharingCard.setBook(BookMock.getBookDtoMock());
     //   sharingCard.setRecords();
        sharingCard.setId(1L);

        return sharingCard;
    }
}
