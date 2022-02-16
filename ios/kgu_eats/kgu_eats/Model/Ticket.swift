//
//  Ticket.swift
//  kgu_eats
//
//  Created by 유현진 on 2022/02/04.
//

import Foundation

class Ticket{
    let id: Int
    let date: String
    var ticketList: [TicketUnit] = []
    init(id: Int, date: String, ticketList: [TicketUnit]){
        self.id = id
        self.date = date
        self.ticketList = ticketList
    }
    
}

//{
//    "id": 1,
//    "orderDate": "2022-02-15 08:37:02",
//    "orderTicketHistoryUnitDtos": [
//        {
//            "ticketId": 1,
//            "amount": 1
//        },
//        {
//            "ticketId": 2,
//            "amount": 2
//        }
//    ]
//}
