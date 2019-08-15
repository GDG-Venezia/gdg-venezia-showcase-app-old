//
//  ContactsViewController.swift
//  iosApp
//
//  Created by Marco Gomiero on 10/08/2019.
//

import UIKit

class ContactsViewController: UIViewController {

    @IBOutlet weak var labelToolbar: UILabel!
    @IBOutlet weak var tableView: UITableView!
    
    // TODO: change
    private var socialList = [String]()
    
    override func viewDidLoad() {
        super.viewDidLoad()

        self.view.backgroundColor = Colors.backgroundColor
        
        self.labelToolbar.text = "GDG Venezia"
        self.labelToolbar.font = Fonts.get(.regular, size: Fonts.Sizes.xLarge)
        
        let eventCell = UINib(nibName: "IconImageCell", bundle: nil)
        self.tableView.register(eventCell, forCellReuseIdentifier: "SocialCell")
        
        self.tableView.dataSource = self
        self.tableView.delegate = self
        self.tableView.backgroundColor = Colors.backgroundColor
        self.tableView.translatesAutoresizingMaskIntoConstraints = false
        self.tableView.separatorStyle = .none
    }
}

extension ContactsViewController: UITableViewDelegate, UITableViewDataSource {
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "SocialCell", for: indexPath) as! IconImageCell
        cell.backgroundColor = UIColor.clear
        cell.selectionStyle = .none
        
        // TODO: add missing data
        cell.setupSocialCell()
        
        return cell
    }
    
    
    func tableView(_ tableView: UITableView, heightForRowAt indexPath: IndexPath) -> CGFloat {
        return 120
    }
    
    func tableView(_ tableView: UITableView, willDisplay cell: UITableViewCell, forRowAt indexPath: IndexPath) {
        // Cell shadow stuff
        cell.contentView.layer.masksToBounds = true
        let radius = cell.contentView.layer.cornerRadius
        cell.layer.shadowPath = UIBezierPath(roundedRect: cell.bounds, cornerRadius: radius).cgPath
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return self.socialList.count
    }
    
    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        print("item selected")
    }
}
