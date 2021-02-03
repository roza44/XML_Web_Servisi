
export class LoginDTO {
    token:any;
    roles: Array<Authority>;
    expiresIn: any;
}

export class Authority {
    id: number;
    name: string;
}